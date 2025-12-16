package com.avito.android.rating_ui.aspects.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.rating_ui.aspects.view.button.c;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qh0.C47399a;

/* compiled from: RatingAspectsStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/c;", "", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f249931e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.rating_ui.aspects.view.button.c f249932a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.rating_ui.aspects.view.button.c f249933b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.rating_ui.aspects.view.button.c f249934c;

    /* renamed from: d, reason: collision with root package name */
    public final int f249935d;

    /* compiled from: RatingAspectsStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/c$a;", "LLV/c;", "Lcom/avito/android/rating_ui/aspects/view/c;", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<c> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, C47399a.i.f429346a);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
            int[] iArr = C47399a.i.f429347b;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            com.avito.android.rating_ui.aspects.view.button.c.f249919i.getClass();
            com.avito.android.rating_ui.aspects.view.button.c cVarB = c.a.b(typedArrayObtainStyledAttributes2, context);
            typedArrayObtainStyledAttributes2.recycle();
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(5, 0), iArr);
            com.avito.android.rating_ui.aspects.view.button.c cVarB2 = c.a.b(typedArrayObtainStyledAttributes3, context);
            typedArrayObtainStyledAttributes3.recycle();
            TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(1, 0), iArr);
            com.avito.android.rating_ui.aspects.view.button.c cVarB3 = c.a.b(typedArrayObtainStyledAttributes4, context);
            typedArrayObtainStyledAttributes4.recycle();
            c cVar = new c(cVarB, cVarB2, cVarB3, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public a() {
        }
    }

    public c(@k com.avito.android.rating_ui.aspects.view.button.c cVar, @k com.avito.android.rating_ui.aspects.view.button.c cVar2, @k com.avito.android.rating_ui.aspects.view.button.c cVar3, @U int i12) {
        this.f249932a = cVar;
        this.f249933b = cVar2;
        this.f249934c = cVar3;
        this.f249935d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f249932a, cVar.f249932a) && L.f(this.f249933b, cVar.f249933b) && L.f(this.f249934c, cVar.f249934c) && this.f249935d == cVar.f249935d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249935d) + ((this.f249934c.hashCode() + ((this.f249933b.hashCode() + (this.f249932a.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsStyle(selectedStyle=");
        sb2.append(this.f249932a);
        sb2.append(", unselectedStyle=");
        sb2.append(this.f249933b);
        sb2.append(", notActiveStyle=");
        sb2.append(this.f249934c);
        sb2.append(", childHorizontalSpacing=");
        return r.t(sb2, this.f249935d, ')');
    }
}
