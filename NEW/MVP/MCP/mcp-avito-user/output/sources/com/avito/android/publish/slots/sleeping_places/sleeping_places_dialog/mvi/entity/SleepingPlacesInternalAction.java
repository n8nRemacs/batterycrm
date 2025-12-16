package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChooseBed", "CloseScreen", "Init", "PassResult", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$ChooseBed;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$CloseScreen;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$Init;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$PassResult;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface SleepingPlacesInternalAction extends n {

    /* compiled from: SleepingPlacesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$ChooseBed;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChooseBed implements SleepingPlacesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f245033b;

        public ChooseBed(int i12) {
            this.f245033b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChooseBed) && this.f245033b == ((ChooseBed) obj).f245033b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f245033b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChooseBed(bedId="), this.f245033b, ')');
        }
    }

    /* compiled from: SleepingPlacesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$CloseScreen;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements SleepingPlacesInternalAction {
        static {
            new CloseScreen();
        }

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1064550119;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SleepingPlacesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$Init;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SleepingPlacesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f245034b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f245035c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<SleepingPlacesBedType> f245036d;

        public Init(@l String str, @l Integer num, @k List<SleepingPlacesBedType> list) {
            this.f245034b = str;
            this.f245035c = num;
            this.f245036d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f245034b, init.f245034b) && L.f(this.f245035c, init.f245035c) && L.f(this.f245036d, init.f245036d);
        }

        public final int hashCode() {
            String str = this.f245034b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f245035c;
            return this.f245036d.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(subtitle=");
            sb2.append(this.f245034b);
            sb2.append(", selectedBedId=");
            sb2.append(this.f245035c);
            sb2.append(", bedListData=");
            return H.p(sb2, this.f245036d, ')');
        }
    }

    /* compiled from: SleepingPlacesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction$PassResult;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassResult implements SleepingPlacesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f245037b;

        public PassResult(int i12) {
            this.f245037b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassResult) && this.f245037b == ((PassResult) obj).f245037b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f245037b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PassResult(bedId="), this.f245037b, ')');
        }
    }
}
