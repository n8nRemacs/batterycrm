package uF;

import Y61.k;
import com.avito.android.remote.model.Radius;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RadiusListResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LuF/h;", "", "<init>", "()V", "a", "b", "c", "LuF/h$a;", "LuF/h$b;", "LuF/h$c;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class h {

    /* compiled from: RadiusListResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuF/h$a;", "LuF/h;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439871a;

        public a(@k String str) {
            super(null);
            this.f439871a = str;
        }
    }

    /* compiled from: RadiusListResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuF/h$b;", "LuF/h;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends h {
        public b() {
            super(null);
        }
    }

    /* compiled from: RadiusListResult.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LuF/h$c;", "LuF/h;", "", "Lcom/avito/android/remote/model/Radius;", "values", "", "selectedValue", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends h {

        @com.google.gson.annotations.c("value")
        @k
        private final String selectedValue;

        @com.google.gson.annotations.c("values")
        @k
        private final List<Radius> values;

        public c(@k List<Radius> list, @k String str) {
            super(null);
            this.values = list;
            this.selectedValue = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getSelectedValue() {
            return this.selectedValue;
        }

        @k
        public final List<Radius> b() {
            return this.values;
        }
    }

    public /* synthetic */ h(C42822w c42822w) {
        this();
    }

    private h() {
    }
}
