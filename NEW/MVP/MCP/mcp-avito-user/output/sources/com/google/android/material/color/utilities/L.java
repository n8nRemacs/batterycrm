package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Comparator;
import java.util.Map;

/* compiled from: Score.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class L {

    /* compiled from: Score.java */
    public static class a implements Comparator<Map.Entry<Integer, Double>> {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
            return -entry.getValue().compareTo(entry2.getValue());
        }
    }
}
