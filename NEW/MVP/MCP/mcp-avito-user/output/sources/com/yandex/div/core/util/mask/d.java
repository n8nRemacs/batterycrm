package com.yandex.div.core.util.mask;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextDiff.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/util/mask/d;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f367821d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f367822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367824c;

    /* compiled from: TextDiff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/util/mask/d$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static d a(@k String str, @k String str2) {
            if (str.length() > str2.length()) {
                d dVarA = a(str2, str);
                return new d(dVarA.f367822a, dVarA.f367824c, dVarA.f367823b);
            }
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            int i12 = 0;
            while (i12 < length && i12 < str.length() && str.charAt(i12) == str2.charAt(i12)) {
                i12++;
            }
            while (true) {
                int i13 = length - length2;
                if (i13 < i12 || str.charAt(i13) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i14 = (length + 1) - i12;
            return new d(i12, i14, i14 - length2);
        }

        public a() {
        }
    }

    public d(int i12, int i13, int i14) {
        this.f367822a = i12;
        this.f367823b = i13;
        this.f367824c = i14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f367822a == dVar.f367822a && this.f367823b == dVar.f367823b && this.f367824c == dVar.f367824c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f367824c) + r.e(this.f367823b, Integer.hashCode(this.f367822a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextDiff(start=");
        sb2.append(this.f367822a);
        sb2.append(", added=");
        sb2.append(this.f367823b);
        sb2.append(", removed=");
        return r.t(sb2, this.f367824c, ')');
    }
}
