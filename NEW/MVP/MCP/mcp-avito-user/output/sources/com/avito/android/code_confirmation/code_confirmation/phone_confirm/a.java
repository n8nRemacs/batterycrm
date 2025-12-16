package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmedCodeData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a$a;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a$b;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    /* compiled from: ConfirmedCodeData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a$a;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.code_confirmation.code_confirmation.phone_confirm.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3510a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f119589a;

        public C3510a(@k String str) {
            super(null);
            this.f119589a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3510a) && L.f(this.f119589a, ((C3510a) obj).f119589a);
        }

        public final int hashCode() {
            return this.f119589a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f119589a, ')');
        }
    }

    /* compiled from: ConfirmedCodeData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a$b;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f119590a;

        public b(boolean z12) {
            super(null);
            this.f119590a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f119590a == ((b) obj).f119590a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f119590a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Ok(isReverified="), this.f119590a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
