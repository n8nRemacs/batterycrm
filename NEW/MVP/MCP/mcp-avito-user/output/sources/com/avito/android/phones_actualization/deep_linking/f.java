package com.avito.android.phones_actualization.deep_linking;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.PhonesPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActualizePhonesScenario.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/f;", "", "a", "b", "c", "Lcom/avito/android/phones_actualization/deep_linking/f$a;", "Lcom/avito/android/phones_actualization/deep_linking/f$b;", "Lcom/avito/android/phones_actualization/deep_linking/f$c;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: ActualizePhonesScenario.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/f$a;", "Lcom/avito/android/phones_actualization/deep_linking/f;", "<init>", "()V", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f216183a = new a();
    }

    /* compiled from: ActualizePhonesScenario.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/f$b;", "Lcom/avito/android/phones_actualization/deep_linking/f;", "<init>", "()V", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f216184a = new b();
    }

    /* compiled from: ActualizePhonesScenario.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/f$c;", "Lcom/avito/android/phones_actualization/deep_linking/f;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhonesPayload f216185a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f216186b;

        public c(@Y61.k PhonesPayload phonesPayload, boolean z12) {
            this.f216185a = phonesPayload;
            this.f216186b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f216185a, cVar.f216185a) && this.f216186b == cVar.f216186b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f216186b) + (this.f216185a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPhones(payload=");
            sb2.append(this.f216185a);
            sb2.append(", isConfirmable=");
            return r.x(sb2, this.f216186b, ')');
        }
    }
}
