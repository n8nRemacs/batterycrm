package com.avito.android.beduin.common.component.video;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinVideoModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/video/BeduinVideoState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "PLAYING", "PAUSE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinVideoState {

    @com.google.gson.annotations.c("pause")
    public static final BeduinVideoState PAUSE;

    @com.google.gson.annotations.c("playing")
    public static final BeduinVideoState PLAYING;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f102879b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BeduinVideoState[] f102880c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102881d;

    /* compiled from: BeduinVideoModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/video/BeduinVideoState$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BeduinVideoModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.video.BeduinVideoState$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3085a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102882a;

            static {
                int[] iArr = new int[BeduinVideoState.values().length];
                try {
                    iArr[BeduinVideoState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BeduinVideoState.PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102882a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BeduinVideoState beduinVideoState = new BeduinVideoState("PLAYING", 0);
        PLAYING = beduinVideoState;
        BeduinVideoState beduinVideoState2 = new BeduinVideoState("PAUSE", 1);
        PAUSE = beduinVideoState2;
        BeduinVideoState[] beduinVideoStateArr = {beduinVideoState, beduinVideoState2};
        f102880c = beduinVideoStateArr;
        f102881d = kotlin.enums.c.a(beduinVideoStateArr);
        f102879b = new a(null);
    }

    private BeduinVideoState(String str, int i12) {
    }

    public static BeduinVideoState valueOf(String str) {
        return (BeduinVideoState) Enum.valueOf(BeduinVideoState.class, str);
    }

    public static BeduinVideoState[] values() {
        return (BeduinVideoState[]) f102880c.clone();
    }
}
