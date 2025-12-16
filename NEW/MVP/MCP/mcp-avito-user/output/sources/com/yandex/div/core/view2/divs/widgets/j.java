package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.DivInput;
import com.yandex.div2.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivInputView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/j;", "Lcom/yandex/div/internal/widget/p;", "Lcom/yandex/div/core/view2/divs/widgets/a;", "Lcom/yandex/div/core/view2/divs/widgets/e;", "Lcom/yandex/div/internal/widget/s;", "LF21/b;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/b;", "Lkotlin/Function1;", "Landroid/text/Editable;", "Lkotlin/G0;", "action", "setBoundVariableChangeAction", "(LY41/l;)V", "Lcom/yandex/div2/DivInput;", "f", "Lcom/yandex/div2/DivInput;", "getDiv$div_release", "()Lcom/yandex/div2/DivInput;", "setDiv$div_release", "(Lcom/yandex/div2/DivInput;)V", "div", "", "value", "h", "Z", "j", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/f;", "i", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/K;", "getBorder", "()Lcom/yandex/div2/K;", "border", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class j extends com.yandex.div.internal.widget.p implements InterfaceC38009a, InterfaceC38013e, com.yandex.div.internal.widget.s, F21.b {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public DivInput div;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C38010b f368940g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isTransient;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368942i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f368943j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public a f368944k;

    public j(@Y61.k Context context) {
        super(context);
        this.f370329b = -1;
        this.f370332e = true;
        this.f368942i = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    public final void c(@Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l K k12) {
        this.f368940g = C37931a.U(this, k12, eVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f368943j) {
            super.dispatchDraw(canvas);
            return;
        }
        C38010b c38010b = this.f368940g;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (c38010b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        float f12 = scrollX;
        float f13 = scrollY;
        int iSave = canvas.save();
        try {
            canvas.translate(f12, f13);
            c38010b.c(canvas);
            canvas.translate(-f12, -f13);
            super.dispatchDraw(canvas);
            canvas.translate(f12, f13);
            c38010b.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void draw(@Y61.k Canvas canvas) {
        this.f368943j = true;
        C38010b c38010b = this.f368940g;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (c38010b == null) {
            super.draw(canvas);
        } else {
            float f12 = scrollX;
            float f13 = scrollY;
            int iSave = canvas.save();
            try {
                canvas.translate(f12, f13);
                c38010b.c(canvas);
                canvas.translate(-f12, -f13);
                super.draw(canvas);
                canvas.translate(f12, f13);
                c38010b.d(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        this.f368943j = false;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    public K getBorder() {
        C38010b c38010b = this.f368940g;
        if (c38010b == null) {
            return null;
        }
        return c38010b.f368881e;
    }

    @Y61.l
    /* renamed from: getDiv$div_release, reason: from getter */
    public DivInput getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.InterfaceC38013e
    @Y61.l
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public C38010b getF368940g() {
        return this.f368940g;
    }

    @Override // F21.b
    @Y61.k
    public List<InterfaceC37911f> getSubscriptions() {
        return this.f368942i;
    }

    @Override // com.yandex.div.internal.widget.s
    /* renamed from: j, reason: from getter */
    public final boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        C38010b c38010b = this.f368940g;
        if (c38010b == null) {
            return;
        }
        c38010b.m();
    }

    @Override // F21.b, com.yandex.div.core.view2.c0
    public final void release() {
        g();
        C38010b c38010b = this.f368940g;
        if (c38010b == null) {
            return;
        }
        c38010b.g();
    }

    public void setBoundVariableChangeAction(@Y61.k Y41.l<? super Editable, G0> action) {
        a aVar = new a(action);
        addTextChangedListener(aVar);
        this.f368944k = aVar;
    }

    public void setDiv$div_release(@Y61.l DivInput divInput) {
        this.div = divInput;
    }

    @Override // com.yandex.div.internal.widget.s
    public void setTransient(boolean z12) {
        this.isTransient = z12;
        invalidate();
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "androidx/core/widget/s", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f368945b;

        public a(Y41.l lVar) {
            this.f368945b = lVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            this.f368945b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
