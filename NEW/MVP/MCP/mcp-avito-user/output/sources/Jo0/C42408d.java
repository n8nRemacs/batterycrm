package jo0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SafetySettingsV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljo0/d;", "", "", "Ljo0/c;", "elements", "", "header", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jo0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42408d {

    @com.google.gson.annotations.c("elements")
    @k
    private final List<InterfaceC42407c> elements;

    @com.google.gson.annotations.c("header")
    @k
    private final String header;

    /* JADX WARN: Multi-variable type inference failed */
    public C42408d(@k List<? extends InterfaceC42407c> list, @k String str) {
        this.elements = list;
        this.header = str;
    }

    @k
    public final List<InterfaceC42407c> a() {
        return this.elements;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getHeader() {
        return this.header;
    }
}
