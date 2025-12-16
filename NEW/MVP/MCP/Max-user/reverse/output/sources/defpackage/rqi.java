package defpackage;

import android.text.Spannable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class rqi {
    public static final /* synthetic */ int a = 0;

    public static void a(Spannable spannable, ArrayList arrayList, vj vjVar) {
        ((mi) vjVar.a.get()).getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            u45.r(it.next());
            throw null;
        }
    }

    public static final boolean b(int i) {
        String str;
        Set<CharSequence> set = Collections.EMPTY_SET;
        if (set != null && set.isEmpty()) {
            return false;
        }
        for (CharSequence charSequence : set) {
            switch (i) {
                case 1:
                    str = "MESSAGE_NORMAL_TEXT";
                    break;
                case 2:
                    str = "MESSAGE_BIG_EMOJI_TEXT";
                    break;
                case 3:
                    str = "MESSAGE_INPUT";
                    break;
                case 4:
                    str = "STICKERS_KEYBOARD";
                    break;
                case 5:
                    str = "CHATS_LIST";
                    break;
                case 6:
                    str = "REACTION_SELECT_PANEL";
                    break;
                case 7:
                    str = "REACTION_BADGE";
                    break;
                default:
                    throw null;
            }
            if (dnf.l(str, charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static final Object c(View view, int i) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public static final void d(CharSequence charSequence) {
        Object[] spans = null;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            try {
                spans = spannable.getSpans(0, spannable.length(), hk.class);
            } catch (Throwable unused) {
            }
            hk[] hkVarArr = (hk[]) spans;
            if (hkVarArr != null) {
                for (hk hkVar : hkVarArr) {
                    ssi.o(spannable, apg.class, spannable.getSpanStart(hkVar), spannable.getSpanEnd(hkVar));
                }
            }
        }
    }

    public static final void e(int i, View view, Object obj) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray == null) {
            sparseArray = new SparseArray(2);
            view.setTag(sparseArray);
        }
        sparseArray.put(i, obj);
    }
}
