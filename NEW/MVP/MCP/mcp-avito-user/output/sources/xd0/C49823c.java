package xD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import qD0.C47283a;

/* compiled from: PackageSizesResult.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LxD0/c;", "", "", "headerTitle", "title", "description", "", "LxD0/a;", "list", "LqD0/a;", "alertInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LqD0/a;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "LqD0/a;", "a", "()LqD0/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49823c {

    @com.google.gson.annotations.c("alertInfo")
    @k
    private final C47283a alertInfo;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("headerTitle")
    @k
    private final String headerTitle;

    @com.google.gson.annotations.c("list")
    @k
    private final List<C49821a> list;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C49823c(@k String str, @k String str2, @l String str3, @k List<C49821a> list, @k C47283a c47283a) {
        this.headerTitle = str;
        this.title = str2;
        this.description = str3;
        this.list = list;
        this.alertInfo = c47283a;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C47283a getAlertInfo() {
        return this.alertInfo;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    @k
    public final List<C49821a> d() {
        return this.list;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
