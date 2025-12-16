package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import com.google.android.material.chip.Chip;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class a2b extends n83 implements u6g {
    public final Rect A0;
    public final w3b B0;
    public final LinkedHashMap C0;
    public final m8a D0;
    public final Object E0;
    public final Object F0;
    public y1b y0;
    public final Rect z0;

    public a2b(Context context) {
        super(context);
        this.z0 = new Rect();
        this.A0 = new Rect();
        w3b w3bVar = new w3b(context, 14);
        w3bVar.setMinHeight(kti.d(32 * vw4.d().getDisplayMetrics().density));
        wsf.j(w3bVar, w3bVar.getPaint(), dpg.j);
        v1a v1aVar = a93.s0;
        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().i);
        w3bVar.setBackgroundColor(0);
        mfh.k(w3bVar, false);
        w3bVar.setGravity(16);
        j83 j83Var = new j83(-2, -2);
        w3bVar.setGravity(16);
        float f = 4;
        w3bVar.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        w3bVar.setLayoutParams(j83Var);
        w3bVar.setMaxLines(1);
        this.B0 = w3bVar;
        this.C0 = new LinkedHashMap();
        this.D0 = new m8a();
        this.E0 = ipi.b(3, new p1b(context, 2));
        this.F0 = ipi.b(3, new es9(context, 29, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(kti.d(f * vw4.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(w3bVar);
        float f2 = 12;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(0 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
        w3bVar.setKeyListener(new z1b(this));
        d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final EnhancedVectorDrawable getCancelChipDrawable() {
        return (EnhancedVectorDrawable) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.E0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        v1a v1aVar = a93.s0;
        if (!chip.isChecked()) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(v1aVar.y(chip).b().n));
            chip.setTextColor(v1aVar.y(chip).getText().e);
        } else {
            chip.setChipBackgroundColor(ColorStateList.valueOf(v1aVar.y(chip).b().a.n));
            v1aVar.y(chip).getText();
            chip.setTextColor(-1);
        }
    }

    public final void a(final long j, final long j2, final CharSequence charSequence, String str, final String str2) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.C0;
        if (linkedHashMap.containsKey(lValueOf)) {
            return;
        }
        final Chip chip = new Chip(getMaterialThemeWrapper(), null);
        chip.setId(Long.hashCode(j));
        chip.setText(str);
        wsf.j(chip, chip.getPaint(), dpg.j);
        chip.setClickable(true);
        chip.setCheckable(true);
        chip.setChecked(false);
        chip.setCheckedIcon(null);
        mfh.k(chip, false);
        chip.setEnsureMinTouchTargetSize(false);
        b(chip, chip.isChecked(), j, j2, charSequence, str2);
        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x1b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.b(chip, z, j, j2, charSequence, str2);
            }
        });
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((Chip) ((Map.Entry) it.next()).getValue()).setChecked(false);
        }
        linkedHashMap.put(Long.valueOf(j), chip);
        addView(chip, getChildCount() - 1);
        d();
        y1b y1bVar = this.y0;
        if (y1bVar != null) {
            ViewParent parent = ((a2b) ((i5i) y1bVar).b).getParent();
            ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
            if (scrollView != null) {
                scrollView.post(new o3(0, scrollView));
            }
        }
    }

    public final void b(Chip chip, boolean z, long j, long j2, CharSequence charSequence, String str) {
        if (z) {
            chip.setChipIcon(getCancelChipDrawable());
            chip.setOnTouchListener(new fi1(chip, 3, new pr0(this, j, chip, 3)));
        } else {
            m8a m8aVar = this.D0;
            Object objD = m8aVar.d(j2);
            if (objD == null) {
                objD = new gxa(getContext());
                m8aVar.h(j2, objD);
            }
            gxa gxaVar = (gxa) objD;
            gxaVar.b(fui.a(charSequence, Long.valueOf(j2)), str);
            chip.setChipIcon(gxaVar);
            chip.setOnTouchListener(null);
        }
        setChipStyle(chip);
    }

    public final void c(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.C0;
        Chip chip = (Chip) linkedHashMap.get(lValueOf);
        if (chip == null) {
            return;
        }
        linkedHashMap.remove(Long.valueOf(j));
        removeView(chip);
        d();
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new es0(9, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.z0;
        editText.getHitRect(rect);
        Rect rect2 = this.A0;
        rect2.set(rect);
        rect2.left = rect2.right;
        rect2.right = getRight();
    }

    public final y1b getCallback() {
        return this.y0;
    }

    public final EditText getEditText() {
        return this.B0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.D0.a();
        this.C0.clear();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        EnhancedVectorDrawable enhancedVectorDrawable;
        int i = yebVar.getText().e;
        w3b w3bVar = this.B0;
        w3bVar.setTextColor(i);
        w3bVar.setHintTextColor(yebVar.getText().i);
        t2i.c(w3bVar, yebVar);
        Iterator it = this.C0.entrySet().iterator();
        while (it.hasNext()) {
            setChipStyle((Chip) ((Map.Entry) it.next()).getValue());
        }
        ?? r3 = this.F0;
        boolean zE = r3.e();
        k18 k18Var = r3;
        if (!zE) {
            k18Var = null;
        }
        if (k18Var == null || (enhancedVectorDrawable = (EnhancedVectorDrawable) k18Var.getValue()) == null) {
            return;
        }
        z18.e(enhancedVectorDrawable, "circle_background", -1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = this.z0;
        motionEvent.setLocation(rect.right, rect.bottom / 2.0f);
        return this.B0.dispatchTouchEvent(motionEvent);
    }

    public final void setCallback(y1b y1bVar) {
        this.y0 = y1bVar;
    }
}
