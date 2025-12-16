package com.avito.android.extended_profile_adverts.mvi;

import Y41.p;
import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_adverts.di.n;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import oA.C44609a;
import pA.InterfaceC46926a;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_adverts/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LpA/a;", "LpA/b;", "LpA/d;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC46926a, pA.b, pA.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150899a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f150900b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150901c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f150902d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f150903e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_adverts.d f150904f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f150905g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f150906h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E f150907i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f150908j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47264a f150909k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final SearchParams f150910l;

    /* compiled from: ProfileAdvertsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpA/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_adverts.mvi.ProfileAdvertsActor$process$4", f = "ProfileAdvertsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super pA.b>, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC46926a f150912r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC46926a interfaceC46926a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f150912r = interfaceC46926a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f150912r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super pA.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(d.this.f150905g, ((InterfaceC46926a.c) this.f150912r).f428229a, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@n.i @Y61.k String str, @n.g @Y61.k String str2, @n.h boolean z12, @Y61.l @n.c String str3, @Y61.l @n.f String str4, @Y61.k com.avito.android.extended_profile_adverts.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k InterfaceC47264a interfaceC47264a, @n.a @Y61.l SearchParams searchParams) {
        this.f150899a = str;
        this.f150900b = str2;
        this.f150901c = z12;
        this.f150902d = str3;
        this.f150903e = str4;
        this.f150904f = dVar;
        this.f150905g = aVar;
        this.f150906h = interfaceC28373a;
        this.f150907i = e12;
        this.f150908j = bVar;
        this.f150909k = interfaceC47264a;
        this.f150910l = searchParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new b(this, aVar, null), new com.avito.android.extended_profile_adverts.mvi.a(y.a(this.f150905g.d9()))), C43175k.C(new c(this, aVar, null), c43197r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<pA.b> b(@Y61.k InterfaceC46926a interfaceC46926a, @Y61.k pA.d dVar) {
        Bundle bundle;
        boolean z12 = interfaceC46926a instanceof InterfaceC46926a.C12255a;
        int i12 = dVar.f428247e;
        if (z12) {
            if (dVar.f428248f || dVar.f428250h != null) {
                return C43175k.w();
            }
            return this.f150904f.a(this.f150899a, this.f150900b, this.f150901c, dVar.f428246d, i12 + 1, this.f150902d, this.f150903e, this.f150910l);
        }
        if (interfaceC46926a.equals(InterfaceC46926a.f.f428232a)) {
            ?? r13 = dVar.f428244b;
            if (((Collection) r13).isEmpty()) {
                return C43175k.w();
            }
            InterfaceC47264a interfaceC47264a = this.f150909k;
            interfaceC47264a.getClass();
            interfaceC47264a.c();
            interfaceC47264a.b();
            interfaceC47264a.f();
            return this.f150904f.E5(r13);
        }
        if (interfaceC46926a instanceof InterfaceC46926a.d) {
            return this.f150904f.a(this.f150899a, this.f150900b, this.f150901c, dVar.f428246d, i12 + 1, this.f150902d, this.f150903e, this.f150910l);
        }
        if (!(interfaceC46926a instanceof InterfaceC46926a.b)) {
            if (interfaceC46926a instanceof InterfaceC46926a.e) {
                this.f150908j.c(((InterfaceC46926a.e) interfaceC46926a).f428231a);
                return C43175k.w();
            }
            if (interfaceC46926a instanceof InterfaceC46926a.c) {
                return C43175k.G(new a(interfaceC46926a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC46926a.b bVar = (InterfaceC46926a.b) interfaceC46926a;
        AdvertItem advertItem = bVar.f428227a;
        DeepLink deepLink = advertItem.f268396O;
        if (deepLink instanceof AdvertDetailsLink) {
            bundle = new Bundle();
            bundle.putString("title", advertItem.f268428d);
            bundle.putString("key_category_id", advertItem.f268420a0);
            bundle.putLong("click_time", SystemClock.elapsedRealtime());
            String str = advertItem.f268440i;
            if (str != null) {
                bundle.putString("price", str);
            }
            String str2 = advertItem.f268446l;
            if (str2 != null) {
                bundle.putString("old_price", str2);
            }
            Image image = bVar.f428228b;
            if (image != null) {
                bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
            }
        } else if (deepLink instanceof DialogDeepLink) {
            String strA = this.f150907i.a();
            if (strA == null) {
                strA = "";
            }
            this.f150906h.c(new C44609a(strA, this.f150899a, false));
            bundle = new Bundle();
            bundle.putBoolean("must_use_re23", true);
        } else {
            bundle = null;
        }
        b.a.a(this.f150905g, advertItem.f268396O, null, bundle, 2);
        return C43175k.w();
    }
}
