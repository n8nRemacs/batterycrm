package com.avito.android.lib.design.tooltip;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipPosition.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/q;", "Lcom/avito/android/lib/design/tooltip/h;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class q implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Integer f181260a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Integer f181261b;

    /* renamed from: c, reason: collision with root package name */
    public int f181262c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public q f181263d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181264e;

    @Override // com.avito.android.lib.design.tooltip.h
    public int c() {
        return (int) Math.sqrt(Math.pow(a() * 2.0d, 2.0d) / 2);
    }

    @Override // com.avito.android.lib.design.tooltip.a
    public void e(@Y61.k KV.a aVar) {
        if (this.f181260a == null) {
            this.f181260a = Integer.valueOf(aVar.f9485u);
        }
        if (this.f181261b == null) {
            this.f181261b = Integer.valueOf(aVar.f9482r);
        }
        this.f181262c = aVar.f9484t;
        q qVar = this.f181263d;
        if (qVar != null) {
            qVar.e(aVar);
        }
    }

    @Y61.k
    public abstract Rect g(@Y61.k View view, @Y61.k n nVar);

    public final int h() {
        Integer num = this.f181261b;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Y61.k
    public final Q i(@Y61.k View view, @Y61.k n nVar) {
        Q qI2;
        q qVar = this.f181263d;
        if (qVar != null) {
            if (!this.f181264e) {
                qVar = null;
            }
            if (qVar != null && (qI2 = qVar.i(view, nVar)) != null) {
                return qI2;
            }
        }
        return b(view, nVar);
    }

    @Y61.k
    public final void j(int i12) {
        this.f181261b = Integer.valueOf(i12);
    }

    @Y61.k
    public void k(int i12) {
        this.f181260a = Integer.valueOf(i12);
    }

    @Y61.l
    public final Rect l(@Y61.k View view, @Y61.k n nVar) {
        q qVar = this.f181263d;
        this.f181264e = qVar != null;
        if (qVar != null) {
            return qVar.g(view, nVar);
        }
        return null;
    }
}
