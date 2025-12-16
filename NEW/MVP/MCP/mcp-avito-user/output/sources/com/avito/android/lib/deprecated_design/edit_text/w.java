package com.avito.android.lib.deprecated_design.edit_text;

import hw.InterfaceC41179d;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: Mask.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0005²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/w;", "", "", "isMaskSymbol", "hasRawSymbolToAdd", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f177994a;

    /* renamed from: b, reason: collision with root package name */
    public final char f177995b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f177996c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f177997d;

    public w(@Y61.k String str, char c12) {
        this.f177994a = str;
        this.f177995b = c12;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String str2 = this.f177994a;
            if (i13 >= str2.length()) {
                break;
            }
            int i15 = i14 + 1;
            if (str2.charAt(i13) == this.f177995b) {
                arrayList.add(Integer.valueOf(i14));
            }
            i13++;
            i14 = i15;
        }
        this.f177996c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        while (true) {
            String str3 = this.f177994a;
            if (i12 >= str3.length()) {
                this.f177997d = arrayList2;
                return;
            }
            if (str3.charAt(i12) == this.f177995b) {
                arrayList2.add(Integer.valueOf(i16));
                i16++;
            } else {
                arrayList2.add(-1);
            }
            i12++;
        }
    }

    public static String e(w wVar, CharSequence charSequence) {
        return wVar.d(charSequence, new kotlin.ranges.l(0, charSequence.length(), 1));
    }

    public final int a(int i12) {
        ArrayList arrayList = this.f177996c;
        return i12 < arrayList.size() ? ((Number) arrayList.get(i12)).intValue() : (i12 - arrayList.size()) + this.f177994a.length();
    }

    @Y61.k
    public final String b(@Y61.k String str) {
        StringBuilder sb2 = new StringBuilder();
        l0.f fVar = new l0.f();
        l0.f fVar2 = new l0.f();
        boolean z12 = true;
        while (z12) {
            InterfaceC42726C interfaceC42726CC = C42727D.c(new v(fVar, this));
            InterfaceC42726C interfaceC42726CC2 = C42727D.c(new u(fVar2, str));
            if (((Boolean) interfaceC42726CC.getValue()).booleanValue()) {
                sb2.append(this.f177994a.charAt(fVar.f406840b));
            } else if (((Boolean) interfaceC42726CC2.getValue()).booleanValue()) {
                int i12 = fVar2.f406840b;
                fVar2.f406840b = i12 + 1;
                sb2.append(str.charAt(i12));
            } else {
                z12 = false;
            }
            fVar.f406840b++;
        }
        return sb2.toString();
    }

    public final int c(int i12) {
        ArrayList arrayList = this.f177997d;
        if (i12 > arrayList.size()) {
            return i12 - 1;
        }
        for (int iMin = Math.min(arrayList.size() - 1, i12 - 1); -1 < iMin; iMin--) {
            if (((Number) arrayList.get(iMin)).intValue() != -1) {
                return iMin;
            }
        }
        return ((Number) this.f177996c.get(0)).intValue();
    }

    @Y61.k
    public final String d(@Y61.k CharSequence charSequence, @Y61.k kotlin.ranges.l lVar) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f177996c;
            if (i12 >= arrayList.size() || charSequence.length() <= ((Number) arrayList.get(i12)).intValue()) {
                break;
            }
            int iIntValue = ((Number) arrayList.get(i12)).intValue();
            if (lVar.h(iIntValue)) {
                sb2.append(charSequence.charAt(iIntValue));
            }
            i12++;
        }
        int length = charSequence.length();
        String str = this.f177994a;
        if (length > str.length() && lVar.h(str.length())) {
            sb2.append(charSequence.subSequence(str.length(), Math.min(charSequence.length(), lVar.f406906c)).toString());
        }
        return sb2.toString();
    }
}
