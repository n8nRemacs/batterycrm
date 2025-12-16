package com.avito.android.comfortable_deal.common.view.client;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import coil.compose.C27242f;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AgencyCardSmall.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: AgencyCardSmall.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/compose/f$c$b;", "it", "Lkotlin/G0;", "invoke", "(Lcoil/compose/f$c$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<C27242f.c.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f120654l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f120654l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(C27242f.c.b bVar) {
            this.f120654l.setValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: AgencyCardSmall.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.common.view.client.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3556b extends H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final C3556b f120655b = new C3556b();

        public C3556b() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    /* compiled from: AgencyCardSmall.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f120656l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Image f120657m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Image image, String str) {
            super(2);
            this.f120656l = str;
            this.f120657m = image;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            b.a(this.f120656l, this.f120657m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.lang.String r32, @Y61.l com.avito.android.remote.model.Image r33, @Y61.l androidx.compose.runtime.A r34, int r35) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.common.view.client.b.a(java.lang.String, com.avito.android.remote.model.Image, androidx.compose.runtime.A, int):void");
    }
}
