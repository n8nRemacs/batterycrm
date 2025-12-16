package com.avito.android.advert.item;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.A4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42821v;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BlocksLoggerRequestBuilder.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/i2;", "Lcom/avito/android/advert/item/h2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i2 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<fa.d> f76430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f76431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f76432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsItem[] f76433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f76434e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f76435f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f76436g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsStyle f76437h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f76438i;

    /* compiled from: BlocksLoggerRequestBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<AdvertDetailsItem> f76439a = kotlin.enums.c.a(AdvertDetailsItem.values());
    }

    /* compiled from: BlocksLoggerRequestBuilder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.BlocksLoggerRequestBuilderImpl$trySend$1", f = "BlocksLoggerRequestBuilder.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f76440q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f76442s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f76442s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return i2.this.new b(this.f76442s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.arch.mvi.utils.c bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f76440q;
            i2 i2Var = i2.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    String str = this.f76442s;
                    fa.d dVar = i2Var.f76430a.get();
                    String str2 = i2Var.f76431b;
                    AdvertDetailsStyle advertDetailsStyle = i2Var.f76437h;
                    String strName = advertDetailsStyle != null ? advertDetailsStyle.name() : null;
                    String str3 = i2Var.f76436g;
                    A4 a42 = A4.f318516a;
                    List listM0 = C42745f0.M0(i2Var.f76434e);
                    a42.getClass();
                    HashMap mapF = A4.f("blockIds", listM0);
                    this.f76440q = 1;
                    if (dVar.a(str2, strName, str, str3, mapF, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                bVar = new c.C2712c(kotlin.G0.f406611a);
            } catch (Throwable th2) {
                kotlinx.coroutines.Q0.e(getF411960f());
                bVar = new c.b(th2);
            }
            i2Var.f76438i = bVar.a();
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public i2(@Y61.k h31.e<fa.d> eVar, @Y61.k @InterfaceC30174s String str, @Y61.k com.avito.android.util.R0 r02) {
        this.f76430a = eVar;
        this.f76431b = str;
        this.f76432c = kotlinx.coroutines.U.a(r02.b());
        AbstractC42734a abstractC42734a = (AbstractC42734a) a.f76439a;
        abstractC42734a.getClass();
        this.f76433d = (AdvertDetailsItem[]) C42821v.b(abstractC42734a, new AdvertDetailsItem[0]);
        this.f76434e = new LinkedHashSet();
    }

    @Override // com.avito.android.advert.item.h2
    @Y61.k
    public final h2 a(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AdvertDetailsItem advertDetailsItem = (AdvertDetailsItem) C42756l.F((int) ((com.avito.conveyor_item.a) it.next()).getF74796b(), this.f76433d);
            if (advertDetailsItem != null) {
                this.f76434e.add(advertDetailsItem.name());
            }
        }
        return this;
    }

    @Override // com.avito.android.advert.item.h2
    public final void b() {
        String str = this.f76435f;
        if (this.f76438i || str == null || this.f76434e.isEmpty()) {
            return;
        }
        C43259k.d(this.f76432c, null, null, new b(str, null), 3);
    }

    @Override // com.avito.android.advert.item.h2
    @Y61.k
    public final h2 c(@Y61.k AdvertDetailsStyle advertDetailsStyle) {
        this.f76437h = advertDetailsStyle;
        return this;
    }

    @Override // com.avito.android.advert.item.h2
    @Y61.k
    public final h2 d(@Y61.l String str, @Y61.l String str2) {
        this.f76435f = str;
        this.f76436g = str2;
        return this;
    }
}
