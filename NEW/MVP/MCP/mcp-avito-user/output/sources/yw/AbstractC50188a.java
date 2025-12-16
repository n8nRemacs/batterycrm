package yW;

import Y61.k;
import com.avito.android.location_picker.model.CounterButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertsCountResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LyW/a;", "", "<init>", "()V", "a", "b", "c", "LyW/a$a;", "LyW/a$b;", "LyW/a$c;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC50188a {

    /* compiled from: AdvertsCountResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyW/a$a;", "LyW/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yW.a$a, reason: collision with other inner class name */
    public static final class C12903a extends AbstractC50188a {
    }

    /* compiled from: AdvertsCountResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyW/a$b;", "LyW/a;", "<init>", "()V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yW.a$b */
    public static final class b extends AbstractC50188a {
        public b() {
            super(null);
        }
    }

    /* compiled from: AdvertsCountResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LyW/a$c;", "LyW/a;", "", "advertCount", "Lcom/avito/android/location_picker/model/CounterButton;", "counterButton", "<init>", "(JLcom/avito/android/location_picker/model/CounterButton;)V", "J", "a", "()J", "Lcom/avito/android/location_picker/model/CounterButton;", "b", "()Lcom/avito/android/location_picker/model/CounterButton;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yW.a$c */
    public static final class c extends AbstractC50188a {

        @com.google.gson.annotations.c("totalCount")
        private final long advertCount;

        @com.google.gson.annotations.c("applyButton")
        @k
        private final CounterButton counterButton;

        public c(long j12, @k CounterButton counterButton) {
            super(null);
            this.advertCount = j12;
            this.counterButton = counterButton;
        }

        /* renamed from: a, reason: from getter */
        public final long getAdvertCount() {
            return this.advertCount;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final CounterButton getCounterButton() {
            return this.counterButton;
        }
    }

    public /* synthetic */ AbstractC50188a(C42822w c42822w) {
        this();
    }

    private AbstractC50188a() {
    }
}
