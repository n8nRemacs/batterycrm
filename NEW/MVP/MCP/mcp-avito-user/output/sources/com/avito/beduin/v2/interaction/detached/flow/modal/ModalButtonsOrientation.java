package com.avito.beduin.v2.interaction.detached.flow.modal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModalButtonsOrientation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/ModalButtonsOrientation;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModalButtonsOrientation {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f337340b;

    /* renamed from: c, reason: collision with root package name */
    public static final ModalButtonsOrientation f337341c;

    /* renamed from: d, reason: collision with root package name */
    public static final ModalButtonsOrientation f337342d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ModalButtonsOrientation[] f337343e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337344f;

    /* compiled from: ModalButtonsOrientation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/ModalButtonsOrientation$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ModalButtonsOrientation modalButtonsOrientation = new ModalButtonsOrientation("Horizontal", 0);
        f337341c = modalButtonsOrientation;
        ModalButtonsOrientation modalButtonsOrientation2 = new ModalButtonsOrientation("Vertical", 1);
        f337342d = modalButtonsOrientation2;
        ModalButtonsOrientation[] modalButtonsOrientationArr = {modalButtonsOrientation, modalButtonsOrientation2};
        f337343e = modalButtonsOrientationArr;
        f337344f = kotlin.enums.c.a(modalButtonsOrientationArr);
        f337340b = new a(null);
    }

    public ModalButtonsOrientation() {
        throw null;
    }

    public static ModalButtonsOrientation valueOf(String str) {
        return (ModalButtonsOrientation) Enum.valueOf(ModalButtonsOrientation.class, str);
    }

    public static ModalButtonsOrientation[] values() {
        return (ModalButtonsOrientation[]) f337343e.clone();
    }
}
