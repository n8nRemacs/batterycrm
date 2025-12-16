package ru.mts.biometry.sdk.view.modalcard.wheel.view;

import Fa1.a;
import H91.c;
import Ha1.b;
import Ha1.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.i;
import androidx.core.view.C22829k0;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

@s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u00015B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\fR\"\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u00101\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00104\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/mts/biometry/sdk/view/modalcard/wheel/view/WheelView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "position", "Lkotlin/G0;", "setSelection", "(I)V", "", "itemText", "(Ljava/lang/String;)V", "value", "O", "I", "setWheelOffset", "wheelOffset", "", "P", "Z", "isLooping", "()Z", "setLooping", "(Z)V", "R", "getSelectedWheelIndex", "()I", "setSelectedWheelIndex", "selectedWheelIndex", "LHa1/d;", "S", "LHa1/d;", "getOnWheelViewListener", "()LHa1/d;", "setOnWheelViewListener", "(LHa1/d;)V", "onWheelViewListener", "", "LFa1/c;", "k", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "getSelectedItem", "()Ljava/lang/String;", "selectedItem", "ru/mts/biometry/sdk/view/modalcard/wheel/view/a", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class WheelView extends NestedScrollView {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f436641T = 0;

    /* renamed from: G, reason: collision with root package name */
    public final FrameLayout.LayoutParams f436642G;

    /* renamed from: H, reason: collision with root package name */
    public LinearLayout f436643H;

    /* renamed from: I, reason: collision with root package name */
    public b f436644I;

    /* renamed from: J, reason: collision with root package name */
    public int f436645J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f436646K;

    /* renamed from: L, reason: collision with root package name */
    public int f436647L;

    /* renamed from: M, reason: collision with root package name */
    public int f436648M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f436649N;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    public int wheelOffset;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    public boolean isLooping;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f436652Q;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public int selectedWheelIndex;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    public d onWheelViewListener;

    public WheelView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f436642G = new FrameLayout.LayoutParams(-1, c.a(28));
        this.wheelOffset = 3;
        this.f436652Q = new ArrayList();
        this.selectedWheelIndex = 1;
        w(context);
    }

    private final void setWheelOffset(int i12) {
        if (this.wheelOffset != i12) {
            this.f436646K = true;
        }
        this.wheelOffset = i12;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void d(int i12) {
        super.d(i12 / 2);
    }

    @k
    public final List<Fa1.c> getItems() {
        return this.f436652Q;
    }

    @l
    public final d getOnWheelViewListener() {
        return this.onWheelViewListener;
    }

    @k
    public final String getSelectedItem() {
        ArrayList arrayList = this.f436652Q;
        try {
            if (arrayList.get(this.selectedWheelIndex) instanceof a) {
                return "";
            }
            int i12 = this.selectedWheelIndex;
            return ((Fa1.b) ((i12 < 0 || i12 > C42745f0.J(arrayList)) ? new Fa1.b("") : arrayList.get(i12))).f4791a;
        } catch (Exception unused) {
            return "";
        }
    }

    public final int getSelectedWheelIndex() {
        return this.selectedWheelIndex;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i12, int i13, int i14, int i15) throws Resources.NotFoundException {
        super.onScrollChanged(i12, i13, i14, i15);
        v(i13);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f436649N = true;
        if (motionEvent.getAction() == 1) {
            this.f436645J = getScrollY();
            postDelayed(this.f436644I, 50L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setItems(@k List<Fa1.c> list) throws Resources.NotFoundException {
        ArrayList arrayList = this.f436652Q;
        arrayList.clear();
        arrayList.addAll(list);
        if (this.isLooping) {
            arrayList.addAll(list);
        } else {
            int i12 = this.wheelOffset;
            for (int i13 = 0; i13 < i12; i13++) {
                a aVar = a.f4790a;
                arrayList.add(0, aVar);
                arrayList.add(aVar);
            }
        }
        LinearLayout linearLayout = this.f436643H;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        this.f436647L = (this.wheelOffset * 2) + 1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fa1.c cVar = (Fa1.c) it.next();
            LinearLayout linearLayout2 = this.f436643H;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            FrameLayout frameLayout = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            TextView textView = new TextView(getContext());
            textView.setTypeface(i.c(R.font.mts_compact_regular, textView.getContext()));
            textView.setLayoutParams(layoutParams);
            textView.setSingleLine(true);
            textView.setTextSize(20.0f);
            textView.setText(cVar instanceof Fa1.b ? ((Fa1.b) cVar).f4791a : "");
            textView.setTextAlignment(4);
            textView.setGravity(17);
            frameLayout.setLayoutParams(this.f436642G);
            frameLayout.addView(textView);
            if (this.f436648M == 0 || this.f436646K) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, BeduinInputModel.MIN_TEXT_VERSION));
                this.f436648M = textView.getMeasuredHeight();
                LinearLayout linearLayout3 = this.f436643H;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                linearLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f436648M * this.f436647L));
                setLayoutParams(new LinearLayout.LayoutParams(-1, c.a(160)));
                this.f436646K = false;
            }
            linearLayout2.addView(frameLayout);
        }
        v((this.selectedWheelIndex - this.wheelOffset) * this.f436648M);
    }

    public final void setLooping(boolean z12) {
        this.isLooping = z12;
    }

    public final void setOnWheelViewListener(@l d dVar) {
        this.onWheelViewListener = dVar;
    }

    public final void setSelectedWheelIndex(int i12) {
        this.selectedWheelIndex = i12;
    }

    public final void setSelection(int position) throws Resources.NotFoundException {
        boolean z12 = this.isLooping;
        this.selectedWheelIndex = z12 ? position : this.wheelOffset + position;
        if (!z12) {
            post(new Ha1.c(this, position, 2));
            if (position == 0) {
                post(new b(this, 1));
                return;
            }
            return;
        }
        if (position >= this.wheelOffset) {
            post(new Ha1.c(this, position, 1));
            return;
        }
        post(new Ha1.c(this, position, 0));
        LinearLayout linearLayout = this.f436643H;
        if (linearLayout == null) {
            linearLayout = null;
        }
        x((linearLayout.getChildCount() / 2) + position);
    }

    public final void u() {
        int i12;
        if (this.onWheelViewListener != null && (i12 = this.selectedWheelIndex) >= 0) {
            ArrayList arrayList = this.f436652Q;
            if (i12 < arrayList.size()) {
                d dVar = this.onWheelViewListener;
                if (dVar != null) {
                    dVar.a((Fa1.c) arrayList.get(this.selectedWheelIndex));
                    return;
                }
                return;
            }
        }
        invalidate();
    }

    public final void v(int i12) throws Resources.NotFoundException {
        int i13 = this.f436648M;
        int i14 = (i12 / i13) + this.wheelOffset;
        int i15 = i12 % i13;
        if (i15 != 0 && i15 > i13 / 2) {
            i14++;
        }
        x(i14);
        if (this.isLooping) {
            if (i14 == this.wheelOffset) {
                LinearLayout linearLayout = this.f436643H;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                ArrayList arrayListE = C43033p.E(new C22829k0(linearLayout));
                LinearLayout linearLayout2 = this.f436643H;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                int childCount = linearLayout2.getChildCount() / 2;
                LinearLayout linearLayout3 = this.f436643H;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                for (View view : C42745f0.q0(arrayListE.subList(childCount, linearLayout3.getChildCount()))) {
                    LinearLayout linearLayout4 = this.f436643H;
                    if (linearLayout4 == null) {
                        linearLayout4 = null;
                    }
                    linearLayout4.removeView(view);
                    LinearLayout linearLayout5 = this.f436643H;
                    if (linearLayout5 == null) {
                        linearLayout5 = null;
                    }
                    linearLayout5.addView(view, 0);
                    if (this.f436649N) {
                        LinearLayout linearLayout6 = this.f436643H;
                        if (linearLayout6 == null) {
                            linearLayout6 = null;
                        }
                        setSelection((linearLayout6.getChildCount() / 2) + this.wheelOffset);
                    }
                }
            }
            LinearLayout linearLayout7 = this.f436643H;
            if (linearLayout7 == null) {
                linearLayout7 = null;
            }
            if (i14 == (linearLayout7.getChildCount() - this.wheelOffset) - 1) {
                LinearLayout linearLayout8 = this.f436643H;
                if (linearLayout8 == null) {
                    linearLayout8 = null;
                }
                ArrayList arrayListE2 = C43033p.E(new C22829k0(linearLayout8));
                LinearLayout linearLayout9 = this.f436643H;
                if (linearLayout9 == null) {
                    linearLayout9 = null;
                }
                for (View view2 : arrayListE2.subList(0, linearLayout9.getChildCount() / 2)) {
                    LinearLayout linearLayout10 = this.f436643H;
                    if (linearLayout10 == null) {
                        linearLayout10 = null;
                    }
                    linearLayout10.removeView(view2);
                    LinearLayout linearLayout11 = this.f436643H;
                    LinearLayout linearLayout12 = linearLayout11 == null ? null : linearLayout11;
                    if (linearLayout11 == null) {
                        linearLayout11 = null;
                    }
                    linearLayout12.addView(view2, linearLayout11.getChildCount());
                    if (this.f436649N) {
                        LinearLayout linearLayout13 = this.f436643H;
                        if (linearLayout13 == null) {
                            linearLayout13 = null;
                        }
                        setSelection(((linearLayout13.getChildCount() / 2) - this.wheelOffset) - 1);
                    }
                }
            }
        }
    }

    public final void w(Context context) {
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f436643H = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.f436643H;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        addView(linearLayout2);
        setOnTouchListener(new Ha1.a(0));
        this.f436644I = new b(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView.x(int):void");
    }

    public WheelView(@k Context context) {
        super(context, null);
        this.f436642G = new FrameLayout.LayoutParams(-1, c.a(28));
        this.wheelOffset = 3;
        this.f436652Q = new ArrayList();
        this.selectedWheelIndex = 1;
        w(context);
    }

    public final void setSelection(@k String itemText) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f436652Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Fa1.b) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(((Fa1.b) it2.next()).f4791a, itemText)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            setSelection(i12);
        } else {
            post(new b(this, 2));
        }
    }
}
