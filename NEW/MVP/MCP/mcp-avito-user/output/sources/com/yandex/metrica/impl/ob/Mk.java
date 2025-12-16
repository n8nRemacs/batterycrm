package com.yandex.metrica.impl.ob;

import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.ob.C39107rl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public class Mk implements InterfaceC38736cl {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class> f378962a;

    public Mk() {
        HashSet hashSet = new HashSet();
        this.f378962a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        hashSet.add(TextClock.class);
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N TextView textView) {
        TextView textView2 = textView;
        Iterator<Class> it = this.f378962a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(textView2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.IRRELEVANT_CLASS;
    }
}
