package xJ0;

import Y61.k;
import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts_views_pub.a;
import com.avito.android.user_adverts_views_util.position.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wJ0.InterfaceC49523d;

/* compiled from: UserAdvertItemViewProviderFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LxJ0/b;", "", "b", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xJ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC49850b {

    /* compiled from: UserAdvertItemViewProviderFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xJ0.b$a */
    public static final class a {
        public static /* synthetic */ InterfaceC49849a a(InterfaceC49850b interfaceC49850b, com.avito.android.vas_discount.v2.di.b bVar, InterfaceC12859b.a aVar, int i12) {
            com.avito.android.user_adverts_views_pub.a bVar2 = bVar;
            if ((i12 & 1) != 0) {
                bVar2 = new a.b();
            }
            return interfaceC49850b.a(bVar2, new InterfaceC49523d.a(), new InterfaceC25571b.a(), new C19616a(), aVar);
        }
    }

    @k
    InterfaceC49849a a(@k com.avito.android.user_adverts_views_pub.a aVar, @k InterfaceC49523d interfaceC49523d, @k InterfaceC25571b interfaceC25571b, @k C19616a c19616a, @k InterfaceC12859b.a aVar2);

    /* compiled from: UserAdvertItemViewProviderFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LxJ0/b$b;", "", "a", "LxJ0/b$b$a;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xJ0.b$b, reason: collision with other inner class name */
    public interface InterfaceC12859b {

        /* compiled from: UserAdvertItemViewProviderFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxJ0/b$b$a;", "LxJ0/b$b;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: xJ0.b$b$a */
        public static final class a implements InterfaceC12859b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.util.text.a f442338a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.user_adverts_views_util.position.a f442339b;

            public a(@k com.avito.android.util.text.a aVar, @k com.avito.android.user_adverts_views_util.position.a aVar2) {
                this.f442338a = aVar;
                this.f442339b = aVar2;
            }

            public /* synthetic */ a(com.avito.android.util.text.a aVar, com.avito.android.user_adverts_views_util.position.a aVar2, int i12, C42822w c42822w) {
                this(aVar, (i12 & 2) != 0 ? h.a() : aVar2);
            }
        }
    }
}
