package Rp;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalApplicationListPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LRp/g;", "", "LRp/c;", "mortgageProgram", "LRp/b;", "propertyCost", "propertyType", "", "stringValue", "term", "<init>", "(LRp/c;LRp/b;LRp/c;Ljava/lang/String;LRp/b;)V", "LRp/c;", "getMortgageProgram", "()LRp/c;", "LRp/b;", "getPropertyCost", "()LRp/b;", "getPropertyType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getTerm", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("mortgageProgram")
    @k
    private final c mortgageProgram;

    @com.google.gson.annotations.c("propertyCost")
    @k
    private final b propertyCost;

    @com.google.gson.annotations.c("propertyType")
    @k
    private final c propertyType;

    @com.google.gson.annotations.c("stringValue")
    @k
    private final String stringValue;

    @com.google.gson.annotations.c("term")
    @k
    private final b term;

    public g(@k c cVar, @k b bVar, @k c cVar2, @k String str, @k b bVar2) {
        this.mortgageProgram = cVar;
        this.propertyCost = bVar;
        this.propertyType = cVar2;
        this.stringValue = str;
        this.term = bVar2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }
}
