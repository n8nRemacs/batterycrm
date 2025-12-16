package com.avito.android.advert.item;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import com.avito.android.C29640d;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.L5;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFragmentDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/N;", "Lcom/avito/android/advert_core/advert/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N implements com.avito.android.advert_core.advert.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f71777a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f71778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Context f71779c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.k f71780d;

    public N(@Y61.k Fragment fragment, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k C29640d c29640d) {
        this.f71777a = fragment;
        this.f71778b = interfaceC35741a1;
        this.f71779c = fragment.getContext();
        c29640d.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C29640d.f132175X;
        kotlin.reflect.n<Object> nVar = nVarArr[42];
        boolean zBooleanValue = ((Boolean) c29640d.f132191P.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar2 = nVarArr[44];
        this.f71780d = new com.avito.android.serp.k(zBooleanValue, ((Boolean) c29640d.f132193R.a().invoke()).booleanValue());
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    public final FragmentManager a() {
        return this.f71777a.getChildFragmentManager();
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Fragment getF71777a() {
        return this.f71777a;
    }

    @Override // com.avito.android.advert_core.advert.l
    public final void c(@Y61.l Throwable th2) {
        Context context;
        if (this.f71777a.isVisible() && (context = this.f71779c) != null) {
            L5.b(context, InterfaceC35741a1.a.a(this.f71778b, th2, new M(1, this.f71780d, com.avito.android.serp.k.class, "invoke", "invoke(Ljava/lang/Throwable;)Lcom/avito/android/printable_text/PrintableText;", 0), null, 4).k0(context), 0);
        }
    }

    @Override // com.avito.android.advert_core.advert.l
    public final void d(@Y61.k Y41.l<? super Context, kotlin.G0> lVar) {
        Context context = this.f71779c;
        if (context != null) {
            ((Q1) lVar).invoke(context);
        }
    }

    @Override // com.avito.android.advert_core.advert.l
    @Y61.k
    public final InterfaceC22983P e() {
        return this.f71777a.getViewLifecycleOwner();
    }
}
