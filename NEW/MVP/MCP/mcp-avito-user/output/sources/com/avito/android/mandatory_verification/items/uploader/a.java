package com.avito.android.mandatory_verification.items.uploader;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationUploaderAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/mandatory_verification/items/uploader/a$a;", "Lcom/avito/android/mandatory_verification/items/uploader/a$b;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a {

    /* compiled from: MandatoryVerificationUploaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a$a;", "Lcom/avito/android/mandatory_verification/items/uploader/a;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mandatory_verification.items.uploader.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5423a extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f184687a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f184688b;

        public C5423a(@Y61.k String str, boolean z12) {
            super(null);
            this.f184687a = str;
            this.f184688b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5423a)) {
                return false;
            }
            C5423a c5423a = (C5423a) obj;
            return L.f(this.f184687a, c5423a.f184687a) && this.f184688b == c5423a.f184688b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f184688b) + (this.f184687a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Delete(fileId=");
            sb2.append(this.f184687a);
            sb2.append(", isUploaded=");
            return r.x(sb2, this.f184688b, ')');
        }
    }

    /* compiled from: MandatoryVerificationUploaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a$b;", "Lcom/avito/android/mandatory_verification/items/uploader/a;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f184689a;

        public b(@Y61.k List<String> list) {
            super(null);
            this.f184689a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f184689a, ((b) obj).f184689a);
        }

        public final int hashCode() {
            return this.f184689a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("Upload(mimeTypes="), this.f184689a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
