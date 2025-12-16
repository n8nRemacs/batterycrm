package com.avito.android.messenger.input;

import Y61.k;
import android.view.View;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageInput.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/input/MessageInput;", "", "AttachButtonState", "a", "SendPhotoButtonState", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessageInput {

    /* renamed from: T1, reason: collision with root package name */
    @k
    public static final a f196374T1 = a.f196384a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessageInput.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/input/MessageInput$AttachButtonState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AttachButtonState {

        /* renamed from: b, reason: collision with root package name */
        public static final AttachButtonState f196375b;

        /* renamed from: c, reason: collision with root package name */
        public static final AttachButtonState f196376c;

        /* renamed from: d, reason: collision with root package name */
        public static final AttachButtonState f196377d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AttachButtonState[] f196378e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f196379f;

        static {
            AttachButtonState attachButtonState = new AttachButtonState("VISIBLE", 0);
            f196375b = attachButtonState;
            AttachButtonState attachButtonState2 = new AttachButtonState("DISABLED", 1);
            f196376c = attachButtonState2;
            AttachButtonState attachButtonState3 = new AttachButtonState("HIDDEN", 2);
            f196377d = attachButtonState3;
            AttachButtonState[] attachButtonStateArr = {attachButtonState, attachButtonState2, attachButtonState3};
            f196378e = attachButtonStateArr;
            f196379f = kotlin.enums.c.a(attachButtonStateArr);
        }

        public AttachButtonState() {
            throw null;
        }

        public static AttachButtonState valueOf(String str) {
            return (AttachButtonState) Enum.valueOf(AttachButtonState.class, str);
        }

        public static AttachButtonState[] values() {
            return (AttachButtonState[]) f196378e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessageInput.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/input/MessageInput$SendPhotoButtonState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SendPhotoButtonState {

        /* renamed from: b, reason: collision with root package name */
        public static final SendPhotoButtonState f196380b;

        /* renamed from: c, reason: collision with root package name */
        public static final SendPhotoButtonState f196381c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SendPhotoButtonState[] f196382d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f196383e;

        static {
            SendPhotoButtonState sendPhotoButtonState = new SendPhotoButtonState("SEND_PHOTO_ALLOW", 0);
            f196380b = sendPhotoButtonState;
            SendPhotoButtonState sendPhotoButtonState2 = new SendPhotoButtonState("SEND_PHOTO_DISALLOW", 1);
            f196381c = sendPhotoButtonState2;
            SendPhotoButtonState[] sendPhotoButtonStateArr = {sendPhotoButtonState, sendPhotoButtonState2};
            f196382d = sendPhotoButtonStateArr;
            f196383e = kotlin.enums.c.a(sendPhotoButtonStateArr);
        }

        public SendPhotoButtonState() {
            throw null;
        }

        public static SendPhotoButtonState valueOf(String str) {
            return (SendPhotoButtonState) Enum.valueOf(SendPhotoButtonState.class, str);
        }

        public static SendPhotoButtonState[] values() {
            return (SendPhotoButtonState[]) f196382d.clone();
        }
    }

    /* compiled from: MessageInput.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/input/MessageInput$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f196384a = new a();

        @k
        public static MessageInput a(@k View view, boolean z12) {
            return new b(view, z12);
        }
    }

    void W();

    @k
    z<G0> a();

    void b(boolean z12);

    void c();

    void d(@k String str, boolean z12);

    void e(boolean z12);

    @k
    z<G0> f();

    @k
    /* renamed from: g */
    com.jakewharton.rxrelay3.c getF196390D();

    @k
    z<G0> h();

    void hide();

    @k
    z<G0> i();

    void i0();

    void j(boolean z12);

    @k
    z<G0> k();

    void l(boolean z12);

    void m(boolean z12);

    @k
    /* renamed from: n */
    B0 getF196389C();

    void o(boolean z12, @k CharSequence charSequence);

    @k
    z<CharSequence> p();

    @k
    z<G0> q();

    void r(@k AttachButtonState attachButtonState);

    void s();

    void show();

    @k
    z<G0> t();

    @k
    z<G0> u();
}
