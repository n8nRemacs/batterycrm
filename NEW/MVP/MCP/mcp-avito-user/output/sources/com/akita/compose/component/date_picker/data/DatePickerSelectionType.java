package com.akita.compose.component.date_picker.data;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DatePickerSelectionType.kt */
@H0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType;", "", "a", "Key", "b", "c", "d", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$a;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$b;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$c;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$d;", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface DatePickerSelectionType {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DatePickerSelectionType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$Key;", "", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key {

        /* renamed from: b, reason: collision with root package name */
        public static final Key f61201b;

        /* renamed from: c, reason: collision with root package name */
        public static final Key f61202c;

        /* renamed from: d, reason: collision with root package name */
        public static final Key f61203d;

        /* renamed from: e, reason: collision with root package name */
        public static final Key f61204e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Key[] f61205f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f61206g;

        static {
            Key key = new Key("SingleDate", 0);
            f61201b = key;
            Key key2 = new Key("DateInterval", 1);
            f61202c = key2;
            Key key3 = new Key("SingleOrIntervalDate", 2);
            f61203d = key3;
            Key key4 = new Key("MultipleDates", 3);
            f61204e = key4;
            Key[] keyArr = {key, key2, key3, key4};
            f61205f = keyArr;
            f61206g = kotlin.enums.c.a(keyArr);
        }

        public Key() {
            throw null;
        }

        public static Key valueOf(String str) {
            return (Key) Enum.valueOf(Key.class, str);
        }

        public static Key[] values() {
            return (Key[]) f61205f.clone();
        }
    }

    /* compiled from: DatePickerSelectionType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$a;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType;", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements DatePickerSelectionType {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f61207a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Key f61208b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f61207a, ((a) obj).f61207a);
        }

        @Override // com.akita.compose.component.date_picker.data.DatePickerSelectionType
        @k
        /* renamed from: getKey, reason: from getter */
        public final Key getF61208b() {
            return this.f61208b;
        }

        public final int hashCode() {
            Integer num = this.f61207a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("DateInterval(minDays="), this.f61207a, ')');
        }

        public a(@l Integer num) {
            this.f61207a = num;
            this.f61208b = Key.f61202c;
        }

        public /* synthetic */ a(Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num);
        }
    }

    /* compiled from: DatePickerSelectionType.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$b;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType;", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements DatePickerSelectionType {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f61209a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Key f61210b = Key.f61204e;

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // com.akita.compose.component.date_picker.data.DatePickerSelectionType
        @k
        /* renamed from: getKey */
        public final Key getF61208b() {
            return f61210b;
        }

        public final int hashCode() {
            return 915151320;
        }

        @k
        public final String toString() {
            return "MultipleDates";
        }
    }

    /* compiled from: DatePickerSelectionType.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$c;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType;", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements DatePickerSelectionType {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f61211a = new c();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Key f61212b = Key.f61201b;

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // com.akita.compose.component.date_picker.data.DatePickerSelectionType
        @k
        /* renamed from: getKey */
        public final Key getF61208b() {
            return f61212b;
        }

        public final int hashCode() {
            return -1862071437;
        }

        @k
        public final String toString() {
            return "SingleDate";
        }
    }

    /* compiled from: DatePickerSelectionType.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType$d;", "Lcom/akita/compose/component/date_picker/data/DatePickerSelectionType;", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements DatePickerSelectionType {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f61213a = new d();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Key f61214b = Key.f61203d;

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // com.akita.compose.component.date_picker.data.DatePickerSelectionType
        @k
        /* renamed from: getKey */
        public final Key getF61208b() {
            return f61214b;
        }

        public final int hashCode() {
            return 476114203;
        }

        @k
        public final String toString() {
            return "SingleOrIntervalDate";
        }
    }

    @k
    /* renamed from: getKey */
    Key getF61208b();
}
