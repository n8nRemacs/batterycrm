package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;

/* compiled from: CBREventHandler.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0011\u0015\u0016\u0017\u0018\u0019\u0014\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B.\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB@\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\r%&'()*+,-./01¨\u00062"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent;", "", "", "eventType", "", "Lkotlinx/serialization/b;", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "Companion", "ApplicantDataUpdated", "CBREventAnalytics", "CBREventApplicantLoaded", "CBREventStepCompleted", "CBREventStepInitiated", "CountrySelected", "DocumentTypeSelected", "EventParams", "EventType", "PhotoAccepted", "PhotoDeclined", "ShowMoreGuidance", "SupportItemClicked", "UserStartedVerification", "VerificationStarted", "ViewItem", "Lru/cyberity/cbr/core/data/listener/CBREvent$ApplicantDataUpdated;", "Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventAnalytics;", "Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventApplicantLoaded;", "Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventStepCompleted;", "Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventStepInitiated;", "Lru/cyberity/cbr/core/data/listener/CBREvent$CountrySelected;", "Lru/cyberity/cbr/core/data/listener/CBREvent$DocumentTypeSelected;", "Lru/cyberity/cbr/core/data/listener/CBREvent$PhotoAccepted;", "Lru/cyberity/cbr/core/data/listener/CBREvent$PhotoDeclined;", "Lru/cyberity/cbr/core/data/listener/CBREvent$ShowMoreGuidance;", "Lru/cyberity/cbr/core/data/listener/CBREvent$SupportItemClicked;", "Lru/cyberity/cbr/core/data/listener/CBREvent$UserStartedVerification;", "Lru/cyberity/cbr/core/data/listener/CBREvent$VerificationStarted;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBREvent {

    @k
    private final String eventType;

    @l
    private final Map<String, Object> payload;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final InterfaceC42726C<KSerializer<Object>> $cachedSerializer$delegate = C42727D.b(LazyThreadSafetyMode.f406615c, CBREvent$Companion$$cachedSerializer$delegate$1.INSTANCE);

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$ApplicantDataUpdated;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "values", "", "", "(Ljava/util/List;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApplicantDataUpdated extends CBREvent {
        public ApplicantDataUpdated(@k List<String> list) {
            super(EventType.ApplicantDataUpdated.name(), Collections.singletonMap(EventParams.Value.getValue(), list), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventAnalytics;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "event", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "(Lru/cyberity/cbr/core/data/model/CBRTrackEvents;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CBREventAnalytics extends CBREvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public CBREventAnalytics(@k CBRTrackEvents cBRTrackEvents) {
            String strName = EventType.Analytics.name();
            String value = EventParams.EventPayload.getValue();
            Map<String, Object> payload = cBRTrackEvents.getPayload();
            super(strName, P0.g(new Q(value, payload == null ? P0.c() : payload), new Q(EventParams.EventName.getValue(), cBRTrackEvents.getActivity())), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventApplicantLoaded;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "applicantId", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CBREventApplicantLoaded extends CBREvent {
        public CBREventApplicantLoaded(@k String str) {
            super(EventType.ApplicantLoaded.name(), Collections.singletonMap(EventParams.ApplicantId.getValue(), str), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventStepCompleted;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "applicantId", "", "idDocSetType", "isCancelled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CBREventStepCompleted extends CBREvent {
        public CBREventStepCompleted(@k String str, @k String str2, boolean z12) {
            super(EventType.StepCompleted.name(), P0.g(new Q(EventParams.ApplicantId.getValue(), str), new Q(EventParams.idDocSetType.getValue(), str2), new Q(EventParams.isCancelled.getValue(), Boolean.valueOf(z12))), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$CBREventStepInitiated;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "applicantId", "", "idDocSetType", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CBREventStepInitiated extends CBREvent {
        public CBREventStepInitiated(@k String str, @k String str2) {
            super(EventType.StepInitiated.name(), P0.g(new Q(EventParams.ApplicantId.getValue(), str), new Q(EventParams.idDocSetType.getValue(), str2)), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private final /* synthetic */ InterfaceC42726C get$cachedSerializer$delegate() {
            return CBREvent.$cachedSerializer$delegate;
        }

        @k
        public final KSerializer<CBREvent> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$CountrySelected;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "countryCode", "", "byUser", "", "(Ljava/lang/String;Z)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CountrySelected extends CBREvent {
        public CountrySelected(@k String str, boolean z12) {
            super(EventType.CountrySelected.name(), P0.g(new Q(EventParams.CountryCode.getValue(), str), new Q(EventParams.ByUser.getValue(), Boolean.valueOf(z12))), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$DocumentTypeSelected;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "countryCode", "", "documentType", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DocumentTypeSelected extends CBREvent {
        public DocumentTypeSelected(@k String str, @k String str2) {
            super(EventType.ItemClicked.name(), P0.g(new Q(EventParams.ViewItem.getValue(), ViewItem.DocumentType.name()), new Q(EventParams.CountryCode.getValue(), str), new Q(EventParams.DocumentType.getValue(), str2)), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$EventParams;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "idDocSetType", "isCancelled", "CountryCode", "DocumentType", "ByUser", "Type", "Value", "ViewItem", "ApplicantId", "EventPayload", "EventName", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum EventParams {
        idDocSetType("idDocSetType"),
        isCancelled("isCancelled"),
        CountryCode("CountryCode"),
        DocumentType("DocumentType"),
        ByUser("ByUser"),
        Type("Type"),
        Value("Value"),
        ViewItem("ViewItem"),
        ApplicantId("applicantId"),
        EventPayload("eventPayload"),
        EventName("eventName");


        @k
        private final String value;

        EventParams(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$EventType;", "", "(Ljava/lang/String;I)V", "Analytics", "StepInitiated", "StepCompleted", "CountrySelected", "ApplicantLoaded", "ApplicantDataUpdated", "ItemClicked", "VerificationStarted", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum EventType {
        Analytics,
        StepInitiated,
        StepCompleted,
        CountrySelected,
        ApplicantLoaded,
        ApplicantDataUpdated,
        ItemClicked,
        VerificationStarted
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$PhotoAccepted;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "idDocSetType", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PhotoAccepted extends CBREvent {
        public PhotoAccepted(@k String str) {
            super(EventType.ItemClicked.name(), P0.g(new Q(EventParams.ViewItem.getValue(), ViewItem.PhotoAccepted.name()), new Q(EventParams.idDocSetType.getValue(), str)), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$PhotoDeclined;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "idDocSetType", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PhotoDeclined extends CBREvent {
        public PhotoDeclined(@k String str) {
            super(EventType.ItemClicked.name(), P0.g(new Q(EventParams.ViewItem.getValue(), ViewItem.RetakePhoto.name()), new Q(EventParams.idDocSetType.getValue(), str)), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$ShowMoreGuidance;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ShowMoreGuidance extends CBREvent {

        @k
        public static final ShowMoreGuidance INSTANCE = new ShowMoreGuidance();

        private ShowMoreGuidance() {
            super(EventType.ItemClicked.name(), Collections.singletonMap(EventParams.ViewItem.getValue(), ViewItem.MoreGuidance.name()), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$SupportItemClicked;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SupportItemClicked extends CBREvent {
        public SupportItemClicked(@k String str, @k String str2) {
            super(EventType.ItemClicked.name(), P0.g(new Q(EventParams.ViewItem.getValue(), ViewItem.SupportItem.name()), new Q(EventParams.Type.getValue(), str), new Q(EventParams.Value.getValue(), str2)), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$UserStartedVerification;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UserStartedVerification extends CBREvent {

        @k
        public static final UserStartedVerification INSTANCE = new UserStartedVerification();

        private UserStartedVerification() {
            super(EventType.ItemClicked.name(), Collections.singletonMap(EventParams.ViewItem.getValue(), ViewItem.Continue.name()), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$VerificationStarted;", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "applicantId", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VerificationStarted extends CBREvent {
        public VerificationStarted(@k String str) {
            super(EventType.VerificationStarted.name(), Collections.singletonMap(EventParams.ApplicantId.getValue(), str), null);
        }
    }

    /* compiled from: CBREventHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBREvent$ViewItem;", "", "(Ljava/lang/String;I)V", "Continue", "SupportItem", "MoreGuidance", "RetakePhoto", "PhotoAccepted", "DocumentType", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ViewItem {
        Continue,
        SupportItem,
        MoreGuidance,
        RetakePhoto,
        PhotoAccepted,
        DocumentType
    }

    public /* synthetic */ CBREvent(String str, Map map, C42822w c42822w) {
        this(str, map);
    }

    @InterfaceC42830m
    public /* synthetic */ CBREvent(int i12, String str, Map map, kotlinx.serialization.internal.P0 p02) {
        this.eventType = str;
        if ((i12 & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
    }

    private CBREvent(String str, Map<String, ? extends Object> map) {
        this.eventType = str;
        this.payload = map;
    }

    public /* synthetic */ CBREvent(String str, Map map, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : map, null);
    }
}
