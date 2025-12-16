package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.bq4;
import defpackage.ce0;
import defpackage.cei;
import defpackage.f7b;
import defpackage.f8c;
import defpackage.gr6;
import defpackage.hr6;
import defpackage.jvd;
import defpackage.m45;
import defpackage.me9;
import defpackage.nca;
import defpackage.q1g;
import defpackage.u1g;
import defpackage.y4e;
import defpackage.zd0;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/widgets/TamAvatarView;", "Lce0;", "", "Lu1g;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TamAvatarView extends ce0 implements u1g {
    public q1g w0;

    public TamAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!isInEditMode()) {
            setLayerType(2, null);
            gr6 gr6VarA = new hr6(getContext().getResources()).a();
            getContext();
            m45 m45Var = new m45(gr6VarA);
            this.a = m45Var;
            m45Var.d().setCallback(this);
            y4e y4eVarB = me9.b(context);
            this.d = (f7b) y4eVarB.getAccessor().c(HttpStatus.SC_GONE);
            this.s0 = (zd0) y4eVarB.getAccessor().c(310);
            this.t0 = y4eVarB.h().a;
            this.o = y4eVarB.c();
            this.u0 = (f8c) y4eVarB.getAccessor().c(HttpStatus.SC_PARTIAL_CONTENT);
        }
        q1g q1gVar = (q1g) q1g.d0.a.getValue();
        this.w0 = q1gVar == null ? bq4.e0 : q1gVar;
        this.w0 = nca.d(context);
    }

    @Override // defpackage.ce0
    public final void b(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(jvd.c);
            if (drawableFindDrawableByLayerId != null) {
                cei.k(drawableFindDrawableByLayerId, this.w0.m);
            }
            Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(jvd.b);
            if (drawableFindDrawableByLayerId2 != null) {
                cei.k(drawableFindDrawableByLayerId2, this.w0.k);
            }
        }
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        this.w0 = q1gVar;
        b(this.b);
    }
}
