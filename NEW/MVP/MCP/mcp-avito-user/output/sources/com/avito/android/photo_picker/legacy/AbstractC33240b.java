package com.avito.android.photo_picker.legacy;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPickerView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_picker/legacy/b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_picker/legacy/b$a;", "Lcom/avito/android/photo_picker/legacy/b$b;", "Lcom/avito/android/photo_picker/legacy/b$c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.legacy.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC33240b {

    /* compiled from: PhotoPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/b$a;", "Lcom/avito/android/photo_picker/legacy/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.legacy.b$a */
    public static final /* data */ class a extends AbstractC33240b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f219639a;

        public a(@Y61.k String str) {
            super(null);
            this.f219639a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f219639a, ((a) obj).f219639a);
        }

        public final int hashCode() {
            return this.f219639a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Disabled(reasonMessage="), this.f219639a, ')');
        }
    }

    /* compiled from: PhotoPickerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/b$b;", "Lcom/avito/android/photo_picker/legacy/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.legacy.b$b, reason: collision with other inner class name */
    public static final /* data */ class C6604b extends AbstractC33240b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C6604b f219640a = new C6604b();

        public C6604b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C6604b);
        }

        public final int hashCode() {
            return 1151087862;
        }

        @Y61.k
        public final String toString() {
            return "Enhanced";
        }
    }

    /* compiled from: PhotoPickerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/b$c;", "Lcom/avito/android/photo_picker/legacy/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.legacy.b$c */
    public static final /* data */ class c extends AbstractC33240b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f219641a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 221580777;
        }

        @Y61.k
        public final String toString() {
            return "NotEnhanced";
        }
    }

    public /* synthetic */ AbstractC33240b(C42822w c42822w) {
        this();
    }

    public AbstractC33240b() {
    }
}
