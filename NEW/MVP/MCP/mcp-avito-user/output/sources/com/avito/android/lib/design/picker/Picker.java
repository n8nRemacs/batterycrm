package com.avito.android.lib.design.picker;

import Y41.p;
import Y41.q;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.o0;

/* compiled from: Picker.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006JS\u0010\u0013\u001a\u00020\u00032D\u0010\u0012\u001a@\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014Jt\u0010\u0013\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152_\u0010\u0012\u001a[\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018R0\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR0\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006%"}, d2 = {"Lcom/avito/android/lib/design/picker/Picker;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lkotlin/G0;", "callback", "setOnScrollFinishedCallback", "(LY41/a;)V", "setOnSecondScrollFinishedCallback", "setOnThirdScrollFinishedCallback", "setOnScrollStartedCallback", "setOnSecondScrollStartedCallback", "setOnThirdScrollStartedCallback", "Lkotlin/Function2;", "Lcom/avito/android/lib/design/picker/k;", "Lkotlin/S;", "name", "firstWheelData", "secondWheelData", "onSelected", "setOnSelection", "(LY41/p;)V", "T", "Lkotlin/Function3;", "thirdWheelData", "(LY41/q;)V", "value", "getFirstWheelValue", "()Lcom/avito/android/lib/design/picker/k;", "setFirstWheelValue", "(Lcom/avito/android/lib/design/picker/k;)V", "firstWheelValue", "getSecondWheelValue", "setSecondWheelValue", "secondWheelValue", "getThirdWheelValue", "setThirdWheelValue", "thirdWheelValue", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Picker extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f179977g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f179978b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f179979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f179980d;

    /* renamed from: e, reason: collision with root package name */
    public final int f179981e;

    /* renamed from: f, reason: collision with root package name */
    public final long f179982f;

    /* compiled from: Picker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WheelGravity.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WheelGravity wheelGravity = WheelGravity.f179987b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WheelGravity wheelGravity2 = WheelGravity.f179987b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Picker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "wheelData", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<k<?>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p<k<?>, k<?>, G0> f179984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super k<?>, ? super k<?>, G0> pVar) {
            super(1);
            this.f179984m = pVar;
        }

        @Override // Y41.l
        public final G0 invoke(k<?> kVar) {
            ArrayList arrayList = Picker.this.f179978b;
            i iVar = (i) C42745f0.K(0, arrayList);
            i iVar2 = (i) C42745f0.K(1, arrayList);
            k<?> selectedResult = iVar != null ? iVar.getSelectedResult() : null;
            k<?> selectedResult2 = iVar2 != null ? iVar2.getSelectedResult() : null;
            p<k<?>, k<?>, G0> pVar = this.f179984m;
            if (pVar != null) {
                pVar.invoke(selectedResult, selectedResult2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Picker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/avito/android/lib/design/picker/k;", "wheelData", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<k<?>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q<k<?>, k<?>, k<?>, G0> f179986m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q<? super k<?>, ? super k<?>, ? super k<?>, G0> qVar) {
            super(1);
            this.f179986m = qVar;
        }

        @Override // Y41.l
        public final G0 invoke(k<?> kVar) {
            ArrayList arrayList = Picker.this.f179978b;
            i iVar = (i) C42745f0.K(0, arrayList);
            i iVar2 = (i) C42745f0.K(1, arrayList);
            i iVar3 = (i) C42745f0.K(2, arrayList);
            k<?> selectedResult = iVar != null ? iVar.getSelectedResult() : null;
            k<?> selectedResult2 = iVar2 != null ? iVar2.getSelectedResult() : null;
            k<?> selectedResult3 = iVar3 != null ? iVar3.getSelectedResult() : null;
            q<k<?>, k<?>, k<?>, G0> qVar = this.f179986m;
            if (qVar != null) {
                qVar.invoke(selectedResult, selectedResult2, selectedResult3);
            }
            return G0.f406611a;
        }
    }

    @X41.j
    public Picker(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static /* synthetic */ void d(Picker picker, List list, m mVar, int i12) {
        if ((i12 & 2) != 0) {
            mVar = new m(null, false, 0, 7, null);
        }
        picker.c(list, mVar, null, null);
    }

    public final void a(@Y61.k String str) {
        n nVar = new n(getContext(), str);
        nVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f179979c.addView(nVar);
    }

    public final void b(@Y61.l Y41.l<? super k<?>, G0> lVar) {
        i iVar = (i) C42745f0.K(0, this.f179978b);
        if (iVar != null) {
            iVar.f180031p.add(lVar);
        }
    }

    public final void c(@Y61.k List<? extends k<?>> list, @Y61.k m mVar, @Y61.l k<?> kVar, @Y61.l Y41.l<? super k<?>, G0> lVar) {
        Object next;
        int i12;
        int i13;
        FrameLayout.LayoutParams layoutParams;
        i iVar = new i(getContext(), mVar, list);
        int i14 = mVar.f180052c;
        if (i14 != 0) {
            layoutParams = new FrameLayout.LayoutParams(i14, -1);
        } else {
            o0.a aVar = new o0.a(new o0(new C42770s0(list), com.avito.android.lib.design.picker.b.f179993l));
            Iterator<T> it = aVar.f410559b;
            if (it.hasNext()) {
                next = aVar.next();
                if (it.hasNext()) {
                    int length = ((String) next).length();
                    do {
                        Object next2 = aVar.next();
                        int length2 = ((String) next2).length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.design_picker_wheel_item, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text);
            textView.setText((String) next);
            viewInflate.measure(0, 0);
            int measuredWidth = textView.getMeasuredWidth();
            int iOrdinal = mVar.f180050a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    measuredWidth = C22026a.a(this.f179981e, 2, this.f179980d, measuredWidth);
                } else if (iOrdinal == 2) {
                    i12 = this.f179980d;
                    i13 = this.f179981e;
                }
                iVar.setMinimumWidth(measuredWidth);
                iVar.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(iVar, 14));
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                i12 = this.f179980d * 2;
                i13 = this.f179981e;
            }
            measuredWidth += i12 + i13;
            iVar.setMinimumWidth(measuredWidth);
            iVar.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(iVar, 14));
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        iVar.setLayoutParams(layoutParams);
        if (kVar != null) {
            iVar.setSelectedResult(kVar);
        }
        if (lVar != null) {
            iVar.f180031p.add(lVar);
        }
        this.f179978b.add(iVar);
        this.f179979c.addView(iVar);
    }

    public final void e() {
        this.f179979c.removeAllViews();
        this.f179978b.clear();
    }

    public final void f() {
        Iterator it = this.f179978b.iterator();
        while (it.hasNext()) {
            ((i) it.next()).f180031p.clear();
        }
    }

    public final void g(@Y61.k k kVar, @Y61.k k kVar2) {
        ArrayList arrayList = this.f179978b;
        List<k<?>> items = ((i) arrayList.get(0)).getItems();
        List<k<?>> items2 = ((i) arrayList.get(1)).getItems();
        int iIndexOf = items.indexOf(kVar);
        int iIndexOf2 = items2.indexOf(kVar2);
        if (iIndexOf == 0 && iIndexOf2 == 0) {
            return;
        }
        setOnSelection(new d(items2, iIndexOf2, this, kVar2, items, iIndexOf, kVar));
    }

    @Y61.l
    public final k<?> getFirstWheelValue() {
        i iVar = (i) C42745f0.K(0, this.f179978b);
        if (iVar != null) {
            return iVar.getSelectedResult();
        }
        return null;
    }

    @Y61.l
    public final k<?> getSecondWheelValue() {
        i iVar = (i) C42745f0.K(1, this.f179978b);
        if (iVar != null) {
            return iVar.getSelectedResult();
        }
        return null;
    }

    @Y61.l
    public final k<?> getThirdWheelValue() {
        i iVar = (i) C42745f0.K(2, this.f179978b);
        if (iVar != null) {
            return iVar.getSelectedResult();
        }
        return null;
    }

    public final void h(@Y61.k k kVar, @Y61.k k kVar2) {
        ArrayList arrayList = this.f179978b;
        List<k<?>> items = ((i) arrayList.get(0)).getItems();
        List<k<?>> items2 = ((i) arrayList.get(1)).getItems();
        int iIndexOf = items.indexOf(kVar);
        int iIndexOf2 = items2.indexOf(kVar2);
        if (iIndexOf == items.size() - 1 && iIndexOf2 == items2.size() - 1) {
            return;
        }
        setOnSelection(new e(items2, iIndexOf2, this, kVar2, items, iIndexOf, kVar));
    }

    public final void i(int i12, @Y61.l k<?> kVar) {
        if (i12 == 0) {
            setFirstWheelValue(kVar);
        } else if (i12 == 1) {
            setSecondWheelValue(kVar);
        } else {
            if (i12 != 2) {
                return;
            }
            setThirdWheelValue(kVar);
        }
    }

    public final void setFirstWheelValue(@Y61.l k<?> kVar) {
        i iVar = (i) C42745f0.K(0, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setSelectedResult(kVar);
    }

    public final void setOnScrollFinishedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(0, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollFinished(callback);
    }

    public final void setOnScrollStartedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(0, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollStarted(callback);
    }

    public final void setOnSecondScrollFinishedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(1, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollFinished(callback);
    }

    public final void setOnSecondScrollStartedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(1, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollStarted(callback);
    }

    public final void setOnSelection(@Y61.l p<? super k<?>, ? super k<?>, G0> onSelected) {
        b bVar = new b(onSelected);
        b(bVar);
        i iVar = (i) C42745f0.K(1, this.f179978b);
        if (iVar != null) {
            iVar.f180031p.add(bVar);
        }
    }

    public final void setOnThirdScrollFinishedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(2, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollFinished(callback);
    }

    public final void setOnThirdScrollStartedCallback(@Y61.l Y41.a<G0> callback) {
        i iVar = (i) C42745f0.K(2, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setOnScrollStarted(callback);
    }

    public final void setSecondWheelValue(@Y61.l k<?> kVar) {
        i iVar = (i) C42745f0.K(1, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setSelectedResult(kVar);
    }

    public final void setThirdWheelValue(@Y61.l k<?> kVar) {
        i iVar = (i) C42745f0.K(2, this.f179978b);
        if (iVar == null) {
            return;
        }
        iVar.setSelectedResult(kVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Picker(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.picker : i12;
        int i15 = i14 & 8;
        int i16 = R.style.Design_Widget_Picker;
        i13 = i15 != 0 ? 2132017744 : i13;
        super(context, attributeSet, i12, i13);
        this.f179978b = new ArrayList();
        this.f179982f = 200L;
        TypedValue typedValue = new TypedValue();
        ContextWrapper contextWrapper = new ContextWrapper(context);
        contextWrapper.setTheme(context.getTheme().resolveAttribute(R.attr.picker, typedValue, true) ? typedValue.resourceId : i16);
        LayoutInflater.from(contextWrapper).inflate(R.layout.design_picker, (ViewGroup) this, true);
        this.f179979c = (LinearLayout) findViewById(R.id.container);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178983n0, i12, i13);
        this.f179980d = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, this.f179980d);
        this.f179981e = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, this.f179981e);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final <T> void setOnSelection(@Y61.l q<? super k<?>, ? super k<?>, ? super k<?>, G0> onSelected) {
        c cVar = new c(onSelected);
        b(cVar);
        ArrayList arrayList = this.f179978b;
        i iVar = (i) C42745f0.K(1, arrayList);
        if (iVar != null) {
            iVar.f180031p.add(cVar);
        }
        i iVar2 = (i) C42745f0.K(2, arrayList);
        if (iVar2 != null) {
            iVar2.f180031p.add(cVar);
        }
    }
}
