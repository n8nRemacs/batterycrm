package com.avito.beduin.v2.render.android_view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;

/* compiled from: InnerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/x;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f338027a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public n<?> f338028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC36343m f338029c;

    public x(@Y61.k A a12) {
        this.f338027a = a12;
    }

    @Y61.k
    public final View a(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C36336f c36336f, @Y61.l Bundle bundle, @Y61.l o oVar) {
        String strM = interfaceC36249i.getF336566c();
        A a12 = this.f338027a;
        n<?> nVarA = a12.a(strM);
        if (!kotlin.jvm.internal.L.f(this.f338028b, nVarA)) {
            this.f338028b = nVarA;
            this.f338029c = nVarA.b(a12);
        }
        return this.f338029c.f(viewGroup, kVar, interfaceC36249i, c36336f, bundle, oVar, this.f338027a);
    }

    @Y61.l
    public final Bundle b() {
        InterfaceC36343m interfaceC36343m = this.f338029c;
        if (interfaceC36343m != null) {
            return interfaceC36343m.e();
        }
        return null;
    }
}
