package com.avito.android.change_specific.deep_linking;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileChangeSpecificDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/d;", "", "a", "b", "c", "Lcom/avito/android/change_specific/deep_linking/d$a;", "Lcom/avito/android/change_specific/deep_linking/d$b;", "Lcom/avito/android/change_specific/deep_linking/d$c;", "_avito_extended-profile-change-specific_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: ProfileChangeSpecificDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/d$a;", "Lcom/avito/android/change_specific/deep_linking/d;", "LJu/c$b;", "<init>", "()V", "_avito_extended-profile-change-specific_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f117932b = new a();
    }

    /* compiled from: ProfileChangeSpecificDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/d$b;", "Lcom/avito/android/change_specific/deep_linking/d;", "LJu/c$b;", "<init>", "()V", "_avito_extended-profile-change-specific_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f117933b = new b();
    }

    /* compiled from: ProfileChangeSpecificDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/d$c;", "Lcom/avito/android/change_specific/deep_linking/d;", "LJu/c$b;", "_avito_extended-profile-change-specific_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        public final int f117934b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f117935c;

        public c(int i12, @k String str) {
            this.f117934b = i12;
            this.f117935c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f117934b == cVar.f117934b && L.f(this.f117935c, cVar.f117935c);
        }

        public final int hashCode() {
            return this.f117935c.hashCode() + (Integer.hashCode(this.f117934b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnlySelectComplete(specificId=");
            sb2.append(this.f117934b);
            sb2.append(", specificTitle=");
            return C22026a.c(sb2, this.f117935c, ')');
        }
    }
}
