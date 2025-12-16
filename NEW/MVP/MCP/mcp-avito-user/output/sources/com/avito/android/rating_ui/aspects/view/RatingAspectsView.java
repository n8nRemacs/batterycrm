package com.avito.android.rating_ui.aspects.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.chips.y;
import com.avito.android.rating_ui.aspects.j;
import com.avito.android.rating_ui.aspects.view.a;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: RatingAspectsView.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u001e\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/RatingAspectsView;", "Landroidx/recyclerview/widget/RecyclerView;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/rating_ui/aspects/j;", "Lcom/avito/android/rating_ui/aspects/view/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/avito/android/rating_ui/aspects/view/RatingAspectsChipable;", "newData", "Lkotlin/G0;", "setData", "(Ljava/util/List;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "newState", "setState", "(Lcom/avito/android/rating_ui/aspects/j;)V", "newStyle", "setStyle", "(Lcom/avito/android/rating_ui/aspects/view/c;)V", "getStyle", "()Lcom/avito/android/rating_ui/aspects/view/c;", "a", "b", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingAspectsView extends RecyclerView implements InterfaceC46971a, LV.a<j, c> {

    /* renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ int f249894J0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public y f249895F0;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public c f249896G0;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public j f249897H0;

    /* renamed from: I0, reason: collision with root package name */
    @k
    public final g f249898I0;

    /* compiled from: RatingAspectsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/RatingAspectsView$a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: RatingAspectsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/RatingAspectsView$b;", "", "<init>", "()V", "", "CHIPS_MAX_SELECTED_NOT_SPECIFIED", "I", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public RatingAspectsView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f249898I0 = new g();
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: getStyle, reason: from getter */
    private final c getF249896G0() {
        return this.f249896G0;
    }

    private final void setData(List<RatingAspectsChipable> newData) {
        com.avito.android.rating_ui.aspects.view.a aVar = (com.avito.android.rating_ui.aspects.view.a) getAdapter();
        ArrayList arrayList = new ArrayList(newData);
        C23424o.e eVarA = C23424o.a(new a.C7492a(aVar.f249902f, arrayList), true);
        aVar.f249902f = new ArrayList(arrayList);
        eVarA.b(aVar);
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    @Override // LV.b
    public void setState(@k j newState) {
        j jVar = this.f249897H0;
        if (new com.avito.android.lib.util.c(newState, jVar).f181333c) {
            return;
        }
        this.f249897H0 = newState;
        ArrayList arrayList = jVar != null ? jVar.f249887a : null;
        ArrayList arrayList2 = newState.f249887a;
        if (arrayList2.equals(arrayList)) {
            return;
        }
        setData(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.rating_ui.aspects.view.c r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_ui.aspects.view.RatingAspectsView.setStyle(com.avito.android.rating_ui.aspects.view.c):void");
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
    }
}
