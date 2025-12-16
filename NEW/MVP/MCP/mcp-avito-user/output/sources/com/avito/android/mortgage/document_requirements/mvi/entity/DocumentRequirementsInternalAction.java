package com.avito.android.mortgage.document_requirements.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.document_requirements.model.Document;
import kotlin.Metadata;

/* compiled from: DocumentRequirementsInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DocumentClicked", "Init", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction$DocumentClicked;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction$Init;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DocumentRequirementsInternalAction extends n {

    /* compiled from: DocumentRequirementsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction$DocumentClicked;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentClicked implements DocumentRequirementsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Document f198988b;

        public DocumentClicked(@k Document document) {
            this.f198988b = document;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentClicked) && this.f198988b == ((DocumentClicked) obj).f198988b;
        }

        public final int hashCode() {
            return this.f198988b.hashCode();
        }

        @k
        public final String toString() {
            return "DocumentClicked(document=" + this.f198988b + ')';
        }
    }

    /* compiled from: DocumentRequirementsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction$Init;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements DocumentRequirementsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f198989b = new Init();

        private Init() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return 412067140;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }
}
