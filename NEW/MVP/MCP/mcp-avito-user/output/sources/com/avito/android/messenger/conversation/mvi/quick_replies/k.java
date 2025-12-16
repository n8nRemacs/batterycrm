package com.avito.android.messenger.conversation.mvi.quick_replies;

import arrow.core.Z0;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.ChatAvatar;
import com.avito.android.remote.model.messenger.PublicProfile;
import io.reactivex.rxjava3.core.I;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextState", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Lcom/avito/android/remote/model/Image;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k<T, R> f194111b = new k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        PublicProfile publicProfile;
        ChatAvatar avatar;
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        Object objQ = null;
        if (bVar instanceof b.d) {
            Iterator<T> it = ((Channel) ((b.d) bVar).f207035a).getUsers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (L.f(((User) next).getId(), c5631a.f190236a.f430682d)) {
                    break;
                }
            }
            User user = next;
            if (user != null && (publicProfile = user.getPublicProfile()) != null && (avatar = publicProfile.getAvatar()) != null) {
                objQ = avatar.getImage();
            }
            objQ = I.q(Z0.b(objQ));
        }
        return objQ != null ? objQ : I.l(new IllegalStateException("Channel isn't loaded"));
    }
}
