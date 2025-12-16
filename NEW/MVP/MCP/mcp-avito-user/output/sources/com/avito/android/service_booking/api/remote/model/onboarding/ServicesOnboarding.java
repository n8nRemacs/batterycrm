package com.avito.android.service_booking.api.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServicesOnboarding.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$OnboardingStep;", "steps", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Action;", "action", "<init>", "(Ljava/util/List;Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Action;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Action;", "c", "()Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Action;", "Action", "Event", "OnboardingStep", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServicesOnboarding implements Parcelable {

    @k
    public static final Parcelable.Creator<ServicesOnboarding> CREATOR = new a();

    @c("action")
    @k
    private final Action action;

    @c("steps")
    @k
    private final List<OnboardingStep> steps;

    /* compiled from: ServicesOnboarding.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ServicesOnboarding.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.title, action.title) && L.f(this.uri, action.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public final int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServicesOnboarding.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Event;", "Landroid/os/Parcelable;", "", "eventId", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "I", "c", "()I", "d", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Event implements Parcelable {

        @k
        public static final Parcelable.Creator<Event> CREATOR = new a();

        @c("eventId")
        private final int eventId;

        @c("params")
        @l
        private final Map<String, String> params;

        @c("version")
        private final int version;

        /* compiled from: ServicesOnboarding.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Event> {
            @Override // android.os.Parcelable.Creator
            public final Event createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Event(i12, i13, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Event[] newArray(int i12) {
                return new Event[i12];
            }
        }

        public Event(int i12, int i13, @l Map<String, String> map) {
            this.eventId = i12;
            this.version = i13;
            this.params = map;
        }

        /* renamed from: c, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        /* renamed from: d, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.eventId == event.eventId && this.version == event.version && L.f(this.params, event.params);
        }

        @l
        public final Map<String, String> getParams() {
            return this.params;
        }

        public final int hashCode() {
            int iE2 = r.e(this.version, Integer.hashCode(this.eventId) * 31, 31);
            Map<String, String> map = this.params;
            return iE2 + (map == null ? 0 : map.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Event(eventId=");
            sb2.append(this.eventId);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", params=");
            return r.w(sb2, this.params, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.eventId);
            parcel.writeInt(this.version);
            Map<String, String> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    /* compiled from: ServicesOnboarding.kt */
    @d
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$OnboardingStep;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Event;", "stepOpenedEvent", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Event;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Event;", "c", "()Lcom/avito/android/service_booking/api/remote/model/onboarding/ServicesOnboarding$Event;", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnboardingStep implements Parcelable {

        @k
        public static final Parcelable.Creator<OnboardingStep> CREATOR = new a();

        @c("description")
        @k
        private final AttributedText description;

        @c("image")
        @k
        private final UniversalImage image;

        @c("stepOpenedEvent")
        @l
        private final Event stepOpenedEvent;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServicesOnboarding.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnboardingStep> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingStep createFromParcel(Parcel parcel) {
                return new OnboardingStep((UniversalImage) parcel.readParcelable(OnboardingStep.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(OnboardingStep.class.getClassLoader()), parcel.readInt() == 0 ? null : Event.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingStep[] newArray(int i12) {
                return new OnboardingStep[i12];
            }
        }

        public OnboardingStep(@k UniversalImage universalImage, @k String str, @k AttributedText attributedText, @l Event event) {
            this.image = universalImage;
            this.title = str;
            this.description = attributedText;
            this.stepOpenedEvent = event;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Event getStepOpenedEvent() {
            return this.stepOpenedEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingStep)) {
                return false;
            }
            OnboardingStep onboardingStep = (OnboardingStep) obj;
            return L.f(this.image, onboardingStep.image) && L.f(this.title, onboardingStep.title) && L.f(this.description, onboardingStep.description) && L.f(this.stepOpenedEvent, onboardingStep.stepOpenedEvent);
        }

        @k
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.image.hashCode() * 31, 31, this.title), 31, this.description);
            Event event = this.stepOpenedEvent;
            return iB2 + (event == null ? 0 : event.hashCode());
        }

        @k
        public final String toString() {
            return "OnboardingStep(image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", stepOpenedEvent=" + this.stepOpenedEvent + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.image, i12);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.description, i12);
            Event event = this.stepOpenedEvent;
            if (event == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                event.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ServicesOnboarding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesOnboarding> {
        @Override // android.os.Parcelable.Creator
        public final ServicesOnboarding createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(OnboardingStep.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ServicesOnboarding(arrayList, Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesOnboarding[] newArray(int i12) {
            return new ServicesOnboarding[i12];
        }
    }

    public ServicesOnboarding(@k List<OnboardingStep> list, @k Action action) {
        this.steps = list;
        this.action = action;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    public final List<OnboardingStep> d() {
        return this.steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesOnboarding)) {
            return false;
        }
        ServicesOnboarding servicesOnboarding = (ServicesOnboarding) obj;
        return L.f(this.steps, servicesOnboarding.steps) && L.f(this.action, servicesOnboarding.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.steps.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ServicesOnboarding(steps=" + this.steps + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.steps, parcel);
        while (itJ.hasNext()) {
            ((OnboardingStep) itJ.next()).writeToParcel(parcel, i12);
        }
        this.action.writeToParcel(parcel, i12);
    }
}
