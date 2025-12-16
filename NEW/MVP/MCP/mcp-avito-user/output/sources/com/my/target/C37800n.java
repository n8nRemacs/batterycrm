package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import e11.AbstractC39860d0;
import e11.m2;
import e11.r2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.my.target.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37800n extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public volatile String f364989b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public a f364990c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364991d = false;

    /* renamed from: com.my.target.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f364992a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final String f364993b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final String f364994c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        public final String f364995d;

        public a(@j.N String str, @j.N String str2, @j.N String str3, @j.N String str4) {
            this.f364992a = str;
            this.f364993b = str2;
            this.f364994c = str3;
            this.f364995d = str4;
        }
    }

    public final void g(@j.N Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split("_", 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String strJoin = TextUtils.join(",", hashSet);
        if (TextUtils.isEmpty(strJoin)) {
            return;
        }
        a("kb_lang", strJoin);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:8|9|(5:136|10|11|134|12)|13|19|(13:146|20|21|144|22|23|138|24|25|140|(1:27)(1:29)|28|31)|37|(5:39|(1:41)(1:44)|45|(2:47|(24:49|54|(1:56)(2:57|(1:59)(1:60))|61|(1:66)(1:65)|67|(1:69)(1:70)|71|(1:73)(1:74)|75|(7:122|77|(1:79)(1:80)|81|142|82|(1:84))|130|85|132|86|(1:88)(1:89)|126|90|(3:93|(1:95)(1:96)|97)(1:92)|128|98|99|276|109))(1:50)|51)(1:53)|52|54|(0)(0)|61|(2:63|66)(0)|67|(0)(0)|71|(0)(0)|75|(0)|130|85|132|86|(0)(0)|126|90|(0)(0)|128|98|99|276) */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #9 {all -> 0x00b4, blocks: (B:27:0x0099, B:29:0x00a3), top: B:140:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #9 {all -> 0x00b4, blocks: (B:27:0x0099, B:29:0x00a3), top: B:140:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb A[Catch: all -> 0x00df, TryCatch #13 {all -> 0x00df, blocks: (B:4:0x0005, B:8:0x000b, B:19:0x007a, B:37:0x00c1, B:39:0x00cb, B:41:0x00da, B:45:0x00e4, B:47:0x00ee, B:49:0x00f7, B:54:0x0122, B:61:0x0143, B:63:0x0147, B:67:0x014e, B:75:0x016f, B:99:0x01eb, B:100:0x0276, B:102:0x0279, B:103:0x027a, B:104:0x0282, B:106:0x0288, B:107:0x029b, B:112:0x02aa, B:57:0x0136, B:60:0x0140, B:18:0x0076, B:101:0x0277), top: B:148:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136 A[Catch: all -> 0x00df, TryCatch #13 {all -> 0x00df, blocks: (B:4:0x0005, B:8:0x000b, B:19:0x007a, B:37:0x00c1, B:39:0x00cb, B:41:0x00da, B:45:0x00e4, B:47:0x00ee, B:49:0x00f7, B:54:0x0122, B:61:0x0143, B:63:0x0147, B:67:0x014e, B:75:0x016f, B:99:0x01eb, B:100:0x0276, B:102:0x0279, B:103:0x027a, B:104:0x0282, B:106:0x0288, B:107:0x029b, B:112:0x02aa, B:57:0x0136, B:60:0x0140, B:18:0x0076, B:101:0x0277), top: B:148:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147 A[Catch: all -> 0x00df, TryCatch #13 {all -> 0x00df, blocks: (B:4:0x0005, B:8:0x000b, B:19:0x007a, B:37:0x00c1, B:39:0x00cb, B:41:0x00da, B:45:0x00e4, B:47:0x00ee, B:49:0x00f7, B:54:0x0122, B:61:0x0143, B:63:0x0147, B:67:0x014e, B:75:0x016f, B:99:0x01eb, B:100:0x0276, B:102:0x0279, B:103:0x027a, B:104:0x0282, B:106:0x0288, B:107:0x029b, B:112:0x02aa, B:57:0x0136, B:60:0x0140, B:18:0x0076, B:101:0x0277), top: B:148:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2 A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #5 {all -> 0x01cc, blocks: (B:86:0x01ab, B:89:0x01b2), top: B:132:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7 A[Catch: all -> 0x01e8, TryCatch #2 {all -> 0x01e8, blocks: (B:90:0x01cc, B:93:0x01d7, B:97:0x01e3), top: B:126:0x01cc }] */
    @android.annotation.SuppressLint({"HardwareIds"})
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(@j.N android.content.Context r30) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37800n.h(android.content.Context):void");
    }

    @j.N
    public final String i(@j.N Context context) {
        if (m2.b()) {
            return "";
        }
        if (this.f364989b == null) {
            synchronized (this) {
                try {
                    if (this.f364989b == null) {
                        String strC = r2.a(context).c("instanceId");
                        if (TextUtils.isEmpty(strC)) {
                            strC = UUID.randomUUID().toString();
                            r2.a(context).b("instanceId", strC);
                        }
                        this.f364989b = strC;
                    }
                } finally {
                }
            }
        }
        String str = this.f364989b;
        return str == null ? "" : str;
    }
}
