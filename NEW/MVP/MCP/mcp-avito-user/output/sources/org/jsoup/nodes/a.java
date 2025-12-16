package org.jsoup.nodes;

import a71.C19693c;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* compiled from: Attribute.java */
/* loaded from: classes7.dex */
public class a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f421069e = {"allowfullscreen", "async", "autofocus", BeduinCartItemModel.CHECKED_STRING, "compact", "declare", "default", "defer", BeduinCartItemModel.DISABLED_STRING, "formnovalidate", HiddenParameter.TYPE, "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: b, reason: collision with root package name */
    public final String f421070b;

    /* renamed from: c, reason: collision with root package name */
    public String f421071c;

    /* renamed from: d, reason: collision with root package name */
    public b f421072d;

    public a(String str, String str2, b bVar) {
        org.jsoup.helper.d.d(str);
        String strTrim = str.trim();
        org.jsoup.helper.d.b(strTrim);
        this.f421070b = strTrim;
        this.f421071c = str2;
        this.f421072d = bVar;
    }

    public static boolean c(String str, String str2, Document.OutputSettings outputSettings) {
        return outputSettings.f421047h == Document.OutputSettings.Syntax.f421048b && (str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f421069e, str) >= 0));
    }

    public final void a(StringBuilder sb2, Document.OutputSettings outputSettings) {
        String str = this.f421071c;
        String str2 = this.f421070b;
        sb2.append((CharSequence) str2);
        if (c(str2, str, outputSettings)) {
            return;
        }
        sb2.append("=\"");
        if (str == null) {
            str = "";
        }
        Entities.b(sb2, str, outputSettings, true, false, false);
        sb2.append('\"');
    }

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String setValue(String str) {
        String str2 = this.f421071c;
        b bVar = this.f421072d;
        if (bVar != null) {
            String str3 = this.f421070b;
            String strL = bVar.l(str3);
            int iT2 = this.f421072d.t(str3);
            if (iT2 != -1) {
                this.f421072d.f421076d[iT2] = str;
            }
            str2 = strL;
        }
        this.f421071c = str;
        return str2 == null ? "" : str2;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f421070b;
        String str2 = this.f421070b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = this.f421071c;
        String str4 = aVar.f421071c;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f421070b;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f421071c;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f421070b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f421071c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = C19693c.b();
        try {
            a(sbB, new Document("").f421038j);
            return C19693c.h(sbB);
        } catch (IOException e12) {
            throw new SerializationException(e12);
        }
    }
}
