package ru.cyberity.cbr.core.presentation.helper.camera;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;

/* compiled from: CBRHelperViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "", "()V", "BriefDetails", "Intro", "InvalidValue", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$BriefDetails;", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$Intro;", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$InvalidValue;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CBRHelperViewState {

    /* compiled from: CBRHelperViewState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$BriefDetails;", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "", "title", "brief", "details", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "countryCode", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getBrief", "getDetails", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "getStepInfo", "()Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "Ljava/lang/String;", "getCountryCode", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class BriefDetails extends CBRHelperViewState {

        @k
        private final CharSequence brief;

        @l
        private final String countryCode;

        @k
        private final CharSequence details;

        @k
        private final CBRStepInfo stepInfo;

        @k
        private final CharSequence title;

        public BriefDetails(@k CharSequence charSequence, @k CharSequence charSequence2, @k CharSequence charSequence3, @k CBRStepInfo cBRStepInfo, @l String str) {
            super(null);
            this.title = charSequence;
            this.brief = charSequence2;
            this.details = charSequence3;
            this.stepInfo = cBRStepInfo;
            this.countryCode = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BriefDetails)) {
                return false;
            }
            BriefDetails briefDetails = (BriefDetails) other;
            return L.f(this.title, briefDetails.title) && L.f(this.brief, briefDetails.brief) && L.f(this.details, briefDetails.details) && L.f(this.stepInfo, briefDetails.stepInfo) && L.f(this.countryCode, briefDetails.countryCode);
        }

        @k
        public final CharSequence getBrief() {
            return this.brief;
        }

        @l
        public final String getCountryCode() {
            return this.countryCode;
        }

        @k
        public final CharSequence getDetails() {
            return this.details;
        }

        @k
        public final CBRStepInfo getStepInfo() {
            return this.stepInfo;
        }

        @k
        public final CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.stepInfo.hashCode() + com.avito.android.advert.item.delivery_suggests.l.c(com.avito.android.advert.item.delivery_suggests.l.c(this.title.hashCode() * 31, 31, this.brief), 31, this.details)) * 31;
            String str = this.countryCode;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BriefDetails(title=");
            sb2.append((Object) this.title);
            sb2.append(", brief=");
            sb2.append((Object) this.brief);
            sb2.append(", details=");
            sb2.append((Object) this.details);
            sb2.append(", stepInfo=");
            sb2.append(this.stepInfo);
            sb2.append(", countryCode=");
            return C22026a.c(sb2, this.countryCode, ')');
        }
    }

    /* compiled from: CBRHelperViewState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$Intro;", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "", "", "instuctionsData", "countryCode", "<init>", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "getStepInfo", "()Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "Ljava/util/Map;", "getInstuctionsData", "()Ljava/util/Map;", "Ljava/lang/String;", "getCountryCode", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Intro extends CBRHelperViewState {

        @l
        private final String countryCode;

        @k
        private final Map<String, Object> instuctionsData;

        @k
        private final CBRStepInfo stepInfo;

        public Intro(@k CBRStepInfo cBRStepInfo, @k Map<String, ? extends Object> map, @l String str) {
            super(null);
            this.stepInfo = cBRStepInfo;
            this.instuctionsData = map;
            this.countryCode = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) other;
            return L.f(this.stepInfo, intro.stepInfo) && L.f(this.instuctionsData, intro.instuctionsData) && L.f(this.countryCode, intro.countryCode);
        }

        @l
        public final String getCountryCode() {
            return this.countryCode;
        }

        @k
        public final Map<String, Object> getInstuctionsData() {
            return this.instuctionsData;
        }

        @k
        public final CBRStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public int hashCode() {
            int iC2 = c.c(this.stepInfo.hashCode() * 31, 31, this.instuctionsData);
            String str = this.countryCode;
            return iC2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Intro(stepInfo=");
            sb2.append(this.stepInfo);
            sb2.append(", instuctionsData=");
            sb2.append(this.instuctionsData);
            sb2.append(", countryCode=");
            return C22026a.c(sb2, this.countryCode, ')');
        }
    }

    /* compiled from: CBRHelperViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState$InvalidValue;", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "()V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class InvalidValue extends CBRHelperViewState {

        @k
        public static final InvalidValue INSTANCE = new InvalidValue();

        private InvalidValue() {
            super(null);
        }
    }

    public /* synthetic */ CBRHelperViewState(C42822w c42822w) {
        this();
    }

    private CBRHelperViewState() {
    }
}
