package com.avito.android.profile.pro.impl.screen.item.employee.limits;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.profile.pro.impl.screen.item.employee.limits.ProfileProEmployeeLimitsItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.internal.n;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProEmployeeLimitsView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/f;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f223227b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f223228c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f223229d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f223230e;

    /* compiled from: ProfileProEmployeeLimitsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/g$a;", "", "<init>", "()V", "", "COLUMN_COUNT", "I", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProEmployeeLimitsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/g$b;", "Landroid/widget/LinearLayout;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f223231b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f223232c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f223233d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final View f223234e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final TextView f223235f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final TextView f223236g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f223237h;

        /* compiled from: ProfileProEmployeeLimitsView.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/g$b$a;", "", "<init>", "()V", "", "SUM_WEIGHT", "F", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public b(@k Context context, @k Drawable drawable) {
            super(context);
            setOrientation(0);
            setShowDividers(2);
            setClickable(true);
            setFocusable(true);
            setWeightSum(1.0f);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_profile_pro_employee_limit_card, (ViewGroup) this, false);
            this.f223231b = viewInflate;
            this.f223232c = (TextView) viewInflate.findViewById(R.id.employee_limit_title);
            this.f223233d = (TextView) viewInflate.findViewById(R.id.employee_limit_value);
            addView(viewInflate, new LinearLayout.LayoutParams(-1, -2, 0.5f));
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_profile_pro_employee_limit_card, (ViewGroup) this, false);
            this.f223234e = viewInflate2;
            this.f223235f = (TextView) viewInflate2.findViewById(R.id.employee_limit_title);
            this.f223236g = (TextView) viewInflate2.findViewById(R.id.employee_limit_value);
            addView(viewInflate2, new LinearLayout.LayoutParams(-1, -2, 0.5f));
            setDividerDrawable(drawable);
        }
    }

    /* compiled from: ProfileProEmployeeLimitsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ShapeDrawable> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ShapeDrawable invoke() {
            int iB2 = y6.b(8);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setIntrinsicHeight(iB2);
            shapeDrawable.setIntrinsicWidth(iB2);
            shapeDrawable.getPaint().setColor(0);
            g gVar = g.this;
            gVar.f223227b.setDividerDrawable(shapeDrawable);
            gVar.f223227b.setShowDividers(2);
            return shapeDrawable;
        }
    }

    /* compiled from: ProfileProEmployeeLimitsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/g$b;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<List<b>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<b> invoke() {
            g gVar = g.this;
            Context context = gVar.f223228c;
            InterfaceC42726C interfaceC42726C = gVar.f223230e;
            return C42745f0.e0(new b(context, (Drawable) interfaceC42726C.getValue()), new b(gVar.f223228c, (Drawable) interfaceC42726C.getValue()));
        }
    }

    static {
        new a(null);
    }

    public g(@k View view) {
        super(view);
        this.f223227b = (LinearLayout) view.findViewById(R.id.item_profile_pro_employee_limit_root);
        this.f223228c = view.getContext();
        this.f223229d = C42727D.b(LazyThreadSafetyMode.f406616d, new d());
        this.f223230e = C42727D.c(new c());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.profile.pro.impl.screen.item.employee.limits.f
    public final void Eo(@k ProfileProEmployeeLimitsItem profileProEmployeeLimitsItem) {
        int i12;
        ArrayList arrayList = profileProEmployeeLimitsItem.f223219c;
        int iA2 = n.a(0, arrayList.size() - 1, 2);
        ?? r32 = this.f223229d;
        LinearLayout linearLayout = this.f223227b;
        if (iA2 >= 0) {
            int i13 = 0;
            while (true) {
                ProfileProEmployeeLimitsItem.Limit limit = (ProfileProEmployeeLimitsItem.Limit) C42745f0.K(i13, arrayList);
                ProfileProEmployeeLimitsItem.Limit limit2 = (ProfileProEmployeeLimitsItem.Limit) C42745f0.K(i13 + 1, arrayList);
                i12 = i13 / 2;
                b bVar = (b) C42745f0.K(i12, (List) r32.getValue());
                if (bVar == null) {
                    bVar = new b(this.f223228c, (Drawable) this.f223230e.getValue());
                    ((List) r32.getValue()).add(bVar);
                }
                View view = bVar.f223231b;
                if (limit != null) {
                    bVar.f223232c.setText(limit.f223220b);
                    bVar.f223233d.setText(limit.f223221c);
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                View view2 = bVar.f223234e;
                if (limit2 != null) {
                    bVar.f223235f.setText(limit2.f223220b);
                    bVar.f223236g.setText(limit2.f223221c);
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
                if (!bVar.f223237h) {
                    linearLayout.addView(bVar);
                    bVar.f223237h = true;
                }
                if (i13 == iA2) {
                    break;
                } else {
                    i13 += 2;
                }
            }
        } else {
            i12 = 0;
        }
        int i14 = i12 + 1;
        int iJ2 = C42745f0.J((List) r32.getValue());
        if (i14 > iJ2) {
            return;
        }
        while (true) {
            b bVar2 = (b) C42745f0.K(i14, (List) r32.getValue());
            if (bVar2 != null && bVar2.f223237h) {
                linearLayout.removeView(bVar2);
                bVar2.f223237h = false;
            }
            if (i14 == iJ2) {
                return;
            } else {
                i14++;
            }
        }
    }
}
