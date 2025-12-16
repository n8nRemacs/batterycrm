package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import j.f0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/y;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f178610g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @f0
    public int f178611a;

    /* renamed from: b, reason: collision with root package name */
    @f0
    public int f178612b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public CharSequence f178613c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public List<k> f178614d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super k, G0> f178615e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Drawable f178616f;

    /* compiled from: BottomSheetBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/y$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/k;", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<k, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f178618m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f178618m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(k kVar) {
            k kVar2 = kVar;
            Y41.l<? super k, G0> lVar = y.this.f178615e;
            if (lVar != null) {
                lVar.invoke(kVar2);
            }
            this.f178618m.r();
            return G0.f406611a;
        }
    }

    public /* synthetic */ y(C42822w c42822w) {
        this();
    }

    @Y61.k
    public final d a(@Y61.k Context context) {
        d dVar = new d(context, this.f178611a);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.design_bottom_sheet_dialog_scrollable_content, (ViewGroup) null);
        d.M(dVar, this.f178613c, true, false, 10);
        dVar.G(viewInflate, true);
        dVar.z(this.f178616f);
        d.I(dVar, true);
        View viewFindViewById = viewInflate.findViewById(R.id.items_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        List<k> list = this.f178614d;
        if (list == null) {
            throw new IllegalStateException("Cannot show default BottomSheetDialog without selectable options");
        }
        m mVar = new m(linearLayout, this.f178612b);
        mVar.f178558d = new b(dVar);
        mVar.c(mVar.f178555a, list);
        return dVar;
    }

    public y() {
    }
}
