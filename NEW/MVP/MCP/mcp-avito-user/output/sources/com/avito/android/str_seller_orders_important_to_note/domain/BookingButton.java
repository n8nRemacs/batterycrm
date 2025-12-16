package com.avito.android.str_seller_orders_important_to_note.domain;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ImportantToNoteResponse.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/domain/BookingButton;", "", "Preset", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BookingButton {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final b f291297a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final h f291298b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Preset f291299c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f291300d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImportantToNoteResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/domain/BookingButton$Preset;", "", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preset {

        /* renamed from: c, reason: collision with root package name */
        public static final Preset f291301c;

        /* renamed from: d, reason: collision with root package name */
        public static final Preset f291302d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Preset[] f291303e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f291304f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f291305b;

        static {
            Preset preset = new Preset("Primary", 0, "primary");
            f291301c = preset;
            Preset preset2 = new Preset("Secondary", 1, "secondary");
            f291302d = preset2;
            Preset[] presetArr = {preset, preset2};
            f291303e = presetArr;
            f291304f = kotlin.enums.c.a(presetArr);
        }

        public Preset(String str, int i12, String str2) {
            this.f291305b = str2;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) f291303e.clone();
        }
    }

    public BookingButton(@Y61.l b bVar, @Y61.l h hVar, @Y61.l Preset preset, @Y61.l String str) {
        this.f291297a = bVar;
        this.f291298b = hVar;
        this.f291299c = preset;
        this.f291300d = str;
    }
}
