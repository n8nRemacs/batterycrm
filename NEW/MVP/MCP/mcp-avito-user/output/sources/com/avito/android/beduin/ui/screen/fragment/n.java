package com.avito.android.beduin.ui.screen.fragment;

import androidx.view.M0;
import com.avito.android.beduin.ui.screen.fragment.tabs.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ScreenViewModelFactoryProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqi/b;", "M", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Ljava/lang/Class;", "Landroidx/lifecycle/M0;", "vmClass", "invoke", "(Ljava/lang/Class;)Landroidx/lifecycle/M0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.l<Class<? extends M0>, M0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f104272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j<Object, Object> f104273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BeduinScreenOpenParams f104274n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, j<Object, Object> jVar, BeduinScreenOpenParams beduinScreenOpenParams) {
        super(1);
        this.f104272l = oVar;
        this.f104273m = jVar;
        this.f104274n = beduinScreenOpenParams;
    }

    @Override // Y41.l
    public final M0 invoke(Class<? extends M0> cls) {
        Class<? extends M0> cls2 = cls;
        o oVar = this.f104272l;
        oVar.getClass();
        boolean zF2 = L.f(cls2, s.class);
        j<Object, Object> jVar = this.f104273m;
        l lVar = oVar.f104275a;
        BeduinScreenOpenParams beduinScreenOpenParams = this.f104274n;
        return zF2 ? new s(lVar, jVar, beduinScreenOpenParams) : L.f(cls2, com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j.class) ? new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.j(lVar, jVar, beduinScreenOpenParams) : new k(lVar, jVar, beduinScreenOpenParams);
    }
}
