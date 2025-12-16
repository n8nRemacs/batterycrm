package com.avito.android.beduin.common.component.file_uploader.validation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ValidationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/c;", "", "a", "b", "c", "Lcom/avito/android/beduin/common/component/file_uploader/validation/c$b;", "Lcom/avito/android/beduin/common/component/file_uploader/validation/c$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f101347a = a.f101348a;

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/c$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f101348a = new a();
    }

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/c$b;", "Lcom/avito/android/beduin/common/component/file_uploader/validation/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f101349b;

        public b(@k String str) {
            this.f101349b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f101349b, ((b) obj).f101349b);
        }

        public final int hashCode() {
            return this.f101349b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Invalid(message="), this.f101349b, ')');
        }
    }

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/c$c;", "Lcom/avito/android/beduin/common/component/file_uploader/validation/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.file_uploader.validation.c$c, reason: collision with other inner class name */
    public static final class C3037c implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C3037c f101350b = new C3037c();
    }
}
