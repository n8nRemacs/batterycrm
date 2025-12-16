package com.avito.android.auto_evidence_request;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/auto_evidence_request/s;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/auto_evidence_request/s$a;", "Lcom/avito/android/auto_evidence_request/s$b;", "Lcom/avito/android/auto_evidence_request/s$c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class s {

    /* compiled from: AutoEvidenceRequestMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/s$a;", "Lcom/avito/android/auto_evidence_request/s;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f95282a;

        public a(@Y61.l AttributedText attributedText) {
            super(null);
            this.f95282a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f95282a, ((a) obj).f95282a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f95282a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ToastCanceled(message="), this.f95282a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/s$b;", "Lcom/avito/android/auto_evidence_request/s;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f95283a;

        public b(@Y61.l AttributedText attributedText) {
            super(null);
            this.f95283a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f95283a, ((b) obj).f95283a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f95283a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ToastDeleted(message="), this.f95283a, ')');
        }
    }

    /* compiled from: AutoEvidenceRequestMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/s$c;", "Lcom/avito/android/auto_evidence_request/s;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f95284a;

        public c(@Y61.l AttributedText attributedText) {
            super(null);
            this.f95284a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f95284a, ((c) obj).f95284a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f95284a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ToastSuccess(message="), this.f95284a, ')');
        }
    }

    public /* synthetic */ s(C42822w c42822w) {
        this();
    }

    public s() {
    }
}
