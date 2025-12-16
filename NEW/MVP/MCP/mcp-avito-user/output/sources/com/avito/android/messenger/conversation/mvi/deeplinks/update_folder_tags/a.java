package com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UpdateFolderTagsLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.I;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UpdateFolderTagsLinkDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/UpdateFolderTagsLink;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<UpdateFolderTagsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC47842z f190680f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f190681g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f190682h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f190683i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final hu.akarnokd.rxjava3.schedulers.c f190684j;

    /* compiled from: UpdateFolderTagsLinkDeeplinkHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5641a implements InterfaceC14249c.b {

        /* compiled from: UpdateFolderTagsLinkDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5642a extends AbstractC5641a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f190685b;

            public C5642a(@k String str) {
                super(null);
                this.f190685b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5642a) && L.f(this.f190685b, ((C5642a) obj).f190685b);
            }

            public final int hashCode() {
                return this.f190685b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f190685b, ')');
            }
        }

        /* compiled from: UpdateFolderTagsLinkDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a$b;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/update_folder_tags/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags.a$a$b */
        public static final class b extends AbstractC5641a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f190686b = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC5641a(C42822w c42822w) {
            this();
        }

        public AbstractC5641a() {
        }
    }

    @Inject
    public a(@k InterfaceC47842z interfaceC47842z, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a, @k a.i iVar) {
        this.f190680f = interfaceC47842z;
        this.f190681g = interfaceC28373a;
        this.f190682h = iVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f190683i = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        this.f190684j = cVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UpdateFolderTagsLink updateFolderTagsLink = (UpdateFolderTagsLink) deepLink;
        List listSingletonList = Collections.singletonList(updateFolderTagsLink.f133771b);
        List<String> list = updateFolderTagsLink.f133773d;
        List<String> list2 = updateFolderTagsLink.f133774e;
        I iG2 = this.f190680f.g(listSingletonList, list, list2);
        hu.akarnokd.rxjava3.schedulers.c cVar = this.f190684j;
        this.f190683i.b(iG2.s(cVar).k(new b(this, updateFolderTagsLink)).z(cVar).x(new c(this), new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f190683i.e();
    }
}
