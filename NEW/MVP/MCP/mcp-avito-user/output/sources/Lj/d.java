package lj;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComponentsFormTransform.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Llj/d;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Llj/d$a;", "Llj/d$b;", "Llj/d$c;", "Llj/d$d;", "Llj/d$e;", "Llj/d$f;", "Llj/d$g;", "Llj/d$h;", "Llj/d$i;", "Llj/d$j;", "Llj/d$k;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class d {

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$a;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<BeduinModel> f414154a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f414155b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k List<? extends BeduinModel> list, @Y61.k String str) {
            super(null);
            this.f414154a = list;
            this.f414155b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f414154a, aVar.f414154a) && L.f(this.f414155b, aVar.f414155b);
        }

        public final int hashCode() {
            return this.f414155b.hashCode() + (this.f414154a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddAfterModel(models=");
            sb2.append(this.f414154a);
            sb2.append(", modelId=");
            return C22026a.c(sb2, this.f414155b, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$b;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<BeduinModel> f414156a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f414157b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k List<? extends BeduinModel> list, @Y61.k String str) {
            super(null);
            this.f414156a = list;
            this.f414157b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f414156a, bVar.f414156a) && L.f(this.f414157b, bVar.f414157b);
        }

        public final int hashCode() {
            return this.f414157b.hashCode() + (this.f414156a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddBeforeModel(models=");
            sb2.append(this.f414156a);
            sb2.append(", modelId=");
            return C22026a.c(sb2, this.f414157b, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$c;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<BeduinModel> f414158a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k List<? extends BeduinModel> list) {
            super(null);
            this.f414158a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f414158a, ((c) obj).f414158a);
        }

        public final int hashCode() {
            return this.f414158a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("AddToBeginning(models="), this.f414158a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$d;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lj.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11800d extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<BeduinModel> f414159a;

        /* JADX WARN: Multi-variable type inference failed */
        public C11800d(@Y61.k List<? extends BeduinModel> list) {
            super(null);
            this.f414159a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11800d) && L.f(this.f414159a, ((C11800d) obj).f414159a);
        }

        public final int hashCode() {
            return this.f414159a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("AddToEnd(models="), this.f414159a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$e;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, List<BeduinModelTransform>> f414160a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@Y61.k Map<String, ? extends List<? extends BeduinModelTransform>> map) {
            super(null);
            this.f414160a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f414160a, ((e) obj).f414160a);
        }

        public final int hashCode() {
            return this.f414160a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return r.w(new StringBuilder("Apply(modelsTransforms="), this.f414160a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llj/d$f;", "Llj/d;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f414161a = new f();

        public f() {
            super(null);
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$g;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f414162a;

        public g(@Y61.k List<String> list) {
            super(null);
            this.f414162a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f414162a, ((g) obj).f414162a);
        }

        public final int hashCode() {
            return this.f414162a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("Remove(modelIds="), this.f414162a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$h;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final /* data */ class h extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinModel f414163a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BeduinModel f414164b;

        public h(@Y61.k BeduinModel beduinModel, @Y61.k BeduinModel beduinModel2) {
            super(null);
            this.f414163a = beduinModel;
            this.f414164b = beduinModel2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f414163a, hVar.f414163a) && L.f(this.f414164b, hVar.f414164b);
        }

        public final int hashCode() {
            return this.f414164b.hashCode() + (this.f414163a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Replace(oldModel=" + this.f414163a + ", newModel=" + this.f414164b + ')';
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$i;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f414165a;

        public i(@Y61.k ArrayList arrayList) {
            super(null);
            this.f414165a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f414165a, ((i) obj).f414165a);
        }

        public final int hashCode() {
            return this.f414165a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ReplaceAll(models="), this.f414165a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$j;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, List<BeduinModel>> f414166a;

        /* JADX WARN: Multi-variable type inference failed */
        public j(@Y61.k Map<String, ? extends List<? extends BeduinModel>> map) {
            super(null);
            this.f414166a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f414166a, ((j) obj).f414166a);
        }

        public final int hashCode() {
            return this.f414166a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return r.w(new StringBuilder("ReplaceById(replaceDictionary="), this.f414166a, ')');
        }
    }

    /* compiled from: ComponentsFormTransform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/d$k;", "Llj/d;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<BeduinModel> f414167a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f414168b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(@Y61.k List<? extends BeduinModel> list, @Y61.k String str) {
            super(null);
            this.f414167a = list;
            this.f414168b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f414167a, kVar.f414167a) && L.f(this.f414168b, kVar.f414168b);
        }

        public final int hashCode() {
            return this.f414168b.hashCode() + (this.f414167a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Set(models=");
            sb2.append(this.f414167a);
            sb2.append(", formId=");
            return C22026a.c(sb2, this.f414168b, ')');
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
