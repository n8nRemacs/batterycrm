package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3;", "", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3$Preset;", "preset", "", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3$Preset;Ljava/util/List;)V", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3$Preset;", "a", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3$Preset;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Preset", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotWarningV3 {

    @c("preset")
    @k
    private final Preset preset;

    @c("text")
    @k
    private final List<AttributedText> text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3$Preset;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Red", "Yellow", "WarmGray", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preset {

        @c("red")
        public static final Preset Red;

        @c("warmGray")
        public static final Preset WarmGray;

        @c("yellow")
        public static final Preset Yellow;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Preset[] f159497b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159498c;

        static {
            Preset preset = new Preset("Red", 0, "red");
            Red = preset;
            Preset preset2 = new Preset("Yellow", 1, "yellow");
            Yellow = preset2;
            Preset preset3 = new Preset("WarmGray", 2, "warmGray");
            WarmGray = preset3;
            Preset[] presetArr = {preset, preset2, preset3};
            f159497b = presetArr;
            f159498c = kotlin.enums.c.a(presetArr);
        }

        private Preset(String str, int i12, String str2) {
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) f159497b.clone();
        }
    }

    public SlotWarningV3(@k Preset preset, @k List<AttributedText> list) {
        this.preset = preset;
        this.text = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    @k
    public final List<AttributedText> b() {
        return this.text;
    }
}
