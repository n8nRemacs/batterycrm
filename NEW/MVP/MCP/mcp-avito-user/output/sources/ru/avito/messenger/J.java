package ru.avito.messenger;

import android.net.Uri;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import e91.C39972a;
import e91.C39973b;
import e91.C39975d;
import e91.C39976e;
import e91.C39977f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import ru.avito.messenger.api.entity.Avatar;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.PublicProfile;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Le91/d;", "response", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/ChannelUser;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f430663b;

    public J(D d12) {
        this.f430663b = d12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PublicProfile publicProfile;
        SimpleAction simpleAction;
        Uri uri;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.I.l(new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        h91.j jVar = this.f430663b.f430609g.get();
        C39975d c39975d = (C39975d) ((TypedResult.Success) typedResult).getResult();
        jVar.getClass();
        List<C39977f> listA = c39975d.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (C39977f c39977f : listA) {
            String id2 = c39977f.getId();
            String name = c39977f.getName();
            Long lastActionTime = c39977f.getLastActionTime();
            C39976e publicUserProfile = c39977f.getPublicUserProfile();
            if (publicUserProfile != null) {
                C39972a avatar = publicUserProfile.getAvatar();
                String str = avatar.getDefault();
                Map<Size, Uri> variants = avatar.getImages().getVariants();
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
                Iterator<T> it = variants.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Size size = (Size) entry.getKey();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size.getWidth());
                    sb2.append('x');
                    sb2.append(size.getHeight());
                    linkedHashMap.put(sb2.toString(), entry.getValue());
                }
                Avatar avatar2 = new Avatar(str, new Image(linkedHashMap));
                C39973b deeplink = publicUserProfile.getDeeplink();
                if (deeplink != null) {
                    String title = deeplink.getTitle();
                    String rawDeeplink = deeplink.getRawDeeplink();
                    if (rawDeeplink == null || (uri = Uri.parse(rawDeeplink)) == null) {
                        uri = new NoMatchLink().getUri();
                    }
                    simpleAction = new SimpleAction(title, null, uri, null);
                } else {
                    simpleAction = null;
                }
                publicProfile = new PublicProfile(avatar2, simpleAction);
            } else {
                publicProfile = null;
            }
            arrayList.add(new ChannelUser(id2, name, lastActionTime, publicProfile, c39977f.getTimeDiff(), c39977f.getLabel()));
        }
        return io.reactivex.rxjava3.core.I.q(arrayList);
    }
}
