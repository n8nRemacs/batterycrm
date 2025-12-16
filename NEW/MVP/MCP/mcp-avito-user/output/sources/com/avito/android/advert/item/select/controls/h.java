package com.avito.android.advert.item.select.controls;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoSelectPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/controls/h;", "Lcom/avito/android/advert/item/select/controls/g;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f79412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public y f79413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Z0 f79414c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79415d;

    /* compiled from: AutoSelectPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/select/controls/h$a;", "", "<init>", "()V", "", "BUTTON_WAS_TRACKED_KEY", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@Y61.k InterfaceC28265d interfaceC28265d, @Y61.l @O6.b Kundle kundle) {
        Boolean boolA;
        this.f79412a = interfaceC28265d;
        this.f79415d = (kundle == null || (boolA = kundle.a("button_was_tracked_key")) == null) ? false : boolA.booleanValue();
    }

    @Override // com.avito.android.advert.item.select.controls.g
    public final void b() {
        this.f79413b = A1.h(this.f79412a.getF83157A().N(i.f79416b), new j(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new k(this), 2);
    }

    @Override // com.avito.android.advert.item.select.controls.g
    public final void c0() {
        this.f79414c = null;
    }

    @Override // com.avito.android.advert.item.select.controls.g
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.h(Boolean.valueOf(this.f79415d), "button_was_tracked_key");
        return kundle;
    }

    @Override // com.avito.android.advert.item.select.controls.g
    public final void e0() {
        y yVar = this.f79413b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f79413b = null;
    }

    @Override // com.avito.android.advert.item.select.controls.g
    public final void j0(@Y61.k Z0 z02) {
        this.f79414c = z02;
    }
}
