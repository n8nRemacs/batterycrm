package com.avito.android.lib.beduin_v2.component.select;

import Y41.l;
import android.graphics.drawable.Drawable;
import com.avito.beduin.v2.avito.component.select.state.AvitoSelectState;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.theme.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$a;", "icon", "Landroid/graphics/drawable/Drawable;", "invoke", "(Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$a;)Landroid/graphics/drawable/Drawable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<AvitoSelectState.a, Drawable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f175887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f175888m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, c cVar) {
        super(1);
        this.f175887l = kVar;
        this.f175888m = cVar;
    }

    @Override // Y41.l
    public final Drawable invoke(AvitoSelectState.a aVar) {
        AvitoSelectState.a aVar2 = aVar;
        if (aVar2 == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(this.f175888m.s(aVar2.f335002c));
        return D.c(this.f175887l, aVar2.f335000a, aVar2.f335001b, numValueOf);
    }
}
