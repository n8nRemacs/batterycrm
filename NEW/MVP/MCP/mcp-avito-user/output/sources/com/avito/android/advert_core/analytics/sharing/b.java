package com.avito.android.advert_core.analytics.sharing;

import Y61.k;
import Y61.l;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertSharingEventTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/sharing/b;", "Lcom/avito/android/advert_core/analytics/sharing/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert_core.analytics.sharing.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f82849a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f82850b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f82851c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C29640d f82852d;

    /* compiled from: AdvertSharingEventTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ChannelContext.Item.USER_ID, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TreeClickStreamParent f82854c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f82855d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f82856e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f82857f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f82858g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f82859h;

        public a(TreeClickStreamParent treeClickStreamParent, String str, String str2, String str3, String str4, String str5) {
            this.f82854c = treeClickStreamParent;
            this.f82855d = str;
            this.f82856e = str2;
            this.f82857f = str3;
            this.f82858g = str4;
            this.f82859h = str5;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            b bVar = b.this;
            boolean zBooleanValue = bVar.f82852d.v().invoke().booleanValue();
            InterfaceC28373a interfaceC28373a = bVar.f82849a;
            if (zBooleanValue) {
                interfaceC28373a.c(new h(this.f82854c, this.f82855d, this.f82856e, this.f82857f, this.f82858g, str, 0, "share button", this.f82859h, null, 512, null));
            } else {
                g.f82865e.getClass();
                interfaceC28373a.c(new g(this.f82855d, this.f82856e, this.f82857f, this.f82858g, str, 0, "share button", this.f82859h, null, null));
            }
        }
    }

    /* compiled from: AdvertSharingEventTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.analytics.sharing.b$b, reason: collision with other inner class name */
    public static final class C2456b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C2456b<T> f82860b = new C2456b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "UserId getting for ItemSharingEvent is failure", (Throwable) obj);
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k E e12, @k InterfaceC35745a5 interfaceC35745a5, @k C29640d c29640d) {
        this.f82849a = interfaceC28373a;
        this.f82850b = e12;
        this.f82851c = interfaceC35745a5;
        this.f82852d = c29640d;
    }

    @Override // com.avito.android.advert_core.analytics.sharing.a
    public final void a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l TreeClickStreamParent treeClickStreamParent) {
        this.f82850b.k().r().s(this.f82851c.e()).x(new a(treeClickStreamParent, str, str2, str3, str4, str5), C2456b.f82860b);
    }
}
