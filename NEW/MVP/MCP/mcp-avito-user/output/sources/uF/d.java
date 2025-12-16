package uF;

import Y61.k;
import Y61.l;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddressSuggestionResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LuF/d;", "", "<init>", "()V", "a", "b", "c", "LuF/d$a;", "LuF/d$b;", "LuF/d$c;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class d {

    /* compiled from: AddressSuggestionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuF/d$a;", "LuF/d;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439866a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f439867b;

        public a(@k String str, @l Throwable th2) {
            super(null);
            this.f439866a = str;
            this.f439867b = th2;
        }

        public /* synthetic */ a(String str, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : th2);
        }
    }

    /* compiled from: AddressSuggestionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuF/d$b;", "LuF/d;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f439868a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public b(@l Throwable th2) {
            super(null);
            this.f439868a = th2;
        }

        public /* synthetic */ b(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: AddressSuggestionResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LuF/d$c;", "LuF/d;", "", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "addressSuggestions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends d {

        @com.google.gson.annotations.c("list")
        @k
        private final List<AddressSuggestion> addressSuggestions;

        public c(@k List<AddressSuggestion> list) {
            super(null);
            this.addressSuggestions = list;
        }

        @k
        public final List<AddressSuggestion> a() {
            return this.addressSuggestions;
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    private d() {
    }
}
