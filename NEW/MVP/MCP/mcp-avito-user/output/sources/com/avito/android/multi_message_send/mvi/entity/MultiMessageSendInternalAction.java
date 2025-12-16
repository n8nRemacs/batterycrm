package com.avito.android.multi_message_send.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageSendInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentDataLoaded", "ContentLoading", "Error", "InputChangedInternal", "ItemClicked", "ItemsForSendingNotChosen", "KeyboardStateChangedInternal", "OnAnchorClicked", "OnCloseClicked", "OnListDrawn", "OnListScrolled", "OnResetClicked", "OnSendStarted", "SendError", "SendSuccess", "UserOnCooldown", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ContentDataLoaded;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ContentLoading;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$Error;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$InputChangedInternal;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ItemClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ItemsForSendingNotChosen;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$KeyboardStateChangedInternal;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnAnchorClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnCloseClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnListDrawn;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnListScrolled;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnResetClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnSendStarted;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$SendError;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$SendSuccess;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$UserOnCooldown;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MultiMessageSendInternalAction extends n {

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ContentDataLoaded;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentDataLoaded implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f206754b;

        public ContentDataLoaded(@k ArrayList arrayList) {
            this.f206754b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentDataLoaded) && this.f206754b.equals(((ContentDataLoaded) obj).f206754b);
        }

        public final int hashCode() {
            return this.f206754b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ContentDataLoaded(data="), this.f206754b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ContentLoading;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoading implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ContentLoading f206755b = new ContentLoading();

        private ContentLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ContentLoading);
        }

        public final int hashCode() {
            return -692949240;
        }

        @k
        public final String toString() {
            return "ContentLoading";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$Error;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f206756b = new Error();

        private Error() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -304921629;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$InputChangedInternal;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChangedInternal implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206757b;

        public InputChangedInternal(@k String str) {
            this.f206757b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChangedInternal) && L.f(this.f206757b, ((InputChangedInternal) obj).f206757b);
        }

        public final int hashCode() {
            return this.f206757b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChangedInternal(inputText="), this.f206757b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ItemClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemClicked implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f206758b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f206759c;

        public ItemClicked(long j12, boolean z12) {
            this.f206758b = j12;
            this.f206759c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemClicked)) {
                return false;
            }
            ItemClicked itemClicked = (ItemClicked) obj;
            return this.f206758b == itemClicked.f206758b && this.f206759c == itemClicked.f206759c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206759c) + (Long.hashCode(this.f206758b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemClicked(itemId=");
            sb2.append(this.f206758b);
            sb2.append(", isNeedShowToast=");
            return r.x(sb2, this.f206759c, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$ItemsForSendingNotChosen;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsForSendingNotChosen implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ItemsForSendingNotChosen f206760b = new ItemsForSendingNotChosen();

        private ItemsForSendingNotChosen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ItemsForSendingNotChosen);
        }

        public final int hashCode() {
            return 646656825;
        }

        @k
        public final String toString() {
            return "ItemsForSendingNotChosen";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$KeyboardStateChangedInternal;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class KeyboardStateChangedInternal implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f206761b;

        public KeyboardStateChangedInternal(boolean z12) {
            this.f206761b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeyboardStateChangedInternal) && this.f206761b == ((KeyboardStateChangedInternal) obj).f206761b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206761b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardStateChangedInternal(isOpened="), this.f206761b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnAnchorClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnAnchorClicked implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206762b;

        public OnAnchorClicked(@k String str) {
            this.f206762b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAnchorClicked) && L.f(this.f206762b, ((OnAnchorClicked) obj).f206762b);
        }

        public final int hashCode() {
            return this.f206762b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnAnchorClicked(ident="), this.f206762b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnCloseClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCloseClicked implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnCloseClicked f206763b = new OnCloseClicked();

        private OnCloseClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnCloseClicked);
        }

        public final int hashCode() {
            return 97854227;
        }

        @k
        public final String toString() {
            return "OnCloseClicked";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnListDrawn;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnListDrawn implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f206764b;

        public OnListDrawn(boolean z12) {
            this.f206764b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnListDrawn) && this.f206764b == ((OnListDrawn) obj).f206764b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206764b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnListDrawn(isNeedShowAnchors="), this.f206764b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnListScrolled;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnListScrolled implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f206765b;

        public OnListScrolled(@k String str) {
            this.f206765b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnListScrolled) && L.f(this.f206765b, ((OnListScrolled) obj).f206765b);
        }

        public final int hashCode() {
            return this.f206765b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnListScrolled(ident="), this.f206765b, ')');
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnResetClicked;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnResetClicked implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnResetClicked f206766b = new OnResetClicked();

        private OnResetClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnResetClicked);
        }

        public final int hashCode() {
            return 848708572;
        }

        @k
        public final String toString() {
            return "OnResetClicked";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$OnSendStarted;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSendStarted implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnSendStarted f206767b = new OnSendStarted();

        private OnSendStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnSendStarted);
        }

        public final int hashCode() {
            return -1587679403;
        }

        @k
        public final String toString() {
            return "OnSendStarted";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$SendError;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendError implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendError f206768b = new SendError();

        private SendError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendError);
        }

        public final int hashCode() {
            return 1973719995;
        }

        @k
        public final String toString() {
            return "SendError";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$SendSuccess;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendSuccess implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendSuccess f206769b = new SendSuccess();

        private SendSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendSuccess);
        }

        public final int hashCode() {
            return -2018811658;
        }

        @k
        public final String toString() {
            return "SendSuccess";
        }
    }

    /* compiled from: MultiMessageSendInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction$UserOnCooldown;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserOnCooldown implements MultiMessageSendInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UserOnCooldown f206770b = new UserOnCooldown();

        private UserOnCooldown() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UserOnCooldown);
        }

        public final int hashCode() {
            return 1593468186;
        }

        @k
        public final String toString() {
            return "UserOnCooldown";
        }
    }
}
