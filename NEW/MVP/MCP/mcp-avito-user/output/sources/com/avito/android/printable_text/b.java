package com.avito.android.printable_text;

import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import j.T;
import j.e0;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PrintableText.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_printable-text_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    @k
    public static final PrintableText a() {
        return new RawPrintableText("");
    }

    @k
    public static final PrintableText b(@T int i12, int i13, @k Serializable... serializableArr) {
        return new PluralsResourcePrintableText(i12, i13, C42756l.g0(serializableArr));
    }

    @k
    public static final PrintableText c(@e0 int i12, @k Serializable... serializableArr) {
        return new StringResourcePrintableText(i12, C42756l.g0(serializableArr));
    }

    @k
    public static final PrintableText d(@k p<? super SpannableStringBuilder, ? super Resources, ? extends CharSequence> pVar) {
        return new SpannableStringBuilderPrintableText(pVar);
    }

    @k
    public static final PrintableText e(@k CharSequence charSequence) {
        return new RawPrintableText(charSequence);
    }

    @k
    public static final PrintableText f(@k String str) {
        return new RawPrintableText(str);
    }

    @k
    @InterfaceC42830m
    public static final String g(@k PrintableText printableText, @k Resources resources) {
        if (printableText instanceof PluralsResourcePrintableText) {
            PluralsResourcePrintableText pluralsResourcePrintableText = (PluralsResourcePrintableText) printableText;
            Serializable[] serializableArr = (Serializable[]) pluralsResourcePrintableText.f221871d.toArray(new Serializable[0]);
            return resources.getQuantityString(pluralsResourcePrintableText.f221869b, pluralsResourcePrintableText.f221870c, Arrays.copyOf(serializableArr, serializableArr.length));
        }
        if (printableText instanceof RawPrintableText) {
            return ((RawPrintableText) printableText).f221872b.toString();
        }
        if (printableText instanceof StringResourcePrintableText) {
            StringResourcePrintableText stringResourcePrintableText = (StringResourcePrintableText) printableText;
            Serializable[] serializableArr2 = (Serializable[]) stringResourcePrintableText.f221875c.toArray(new Serializable[0]);
            return resources.getString(stringResourcePrintableText.f221874b, Arrays.copyOf(serializableArr2, serializableArr2.length));
        }
        if (!(printableText instanceof SpannableStringBuilderPrintableText)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((SpannableStringBuilderPrintableText) printableText).f221873b.invoke(new SpannableStringBuilder(), resources).toString();
    }
}
