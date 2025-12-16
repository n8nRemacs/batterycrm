package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* renamed from: androidx.constraintlayout.motion.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22740f {

    /* renamed from: a, reason: collision with root package name */
    public int f43887a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f43888b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f43889c = null;

    /* renamed from: d, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f43890d;

    public static float f(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC22740f clone();

    public AbstractC22740f b(AbstractC22740f abstractC22740f) {
        this.f43887a = abstractC22740f.f43887a;
        this.f43888b = abstractC22740f.f43888b;
        this.f43889c = abstractC22740f.f43889c;
        this.f43890d = abstractC22740f.f43890d;
        return this;
    }

    public abstract void c(HashSet<String> hashSet);

    public abstract void d(Context context, AttributeSet attributeSet);

    public void e(HashMap<String, Integer> map) {
    }
}
