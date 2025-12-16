package Jo0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: SubscriptionMobileUpdateV4Request.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\b\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LJo0/d;", "", "LJo0/a;", "emailFrequency", "", "isEmailEnabled", "isPushAllowed", "isPushEnabled", "isUpdateLastViewTime", "LJo0/b;", "pushFrequency", "", "title", "<init>", "(LJo0/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LJo0/b;Ljava/lang/String;)V", "LJo0/a;", "getEmailFrequency", "()LJo0/a;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LJo0/b;", "getPushFrequency", "()LJo0/b;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    @com.google.gson.annotations.c("emailFrequency")
    @l
    private final C14230a emailFrequency;

    @com.google.gson.annotations.c("isEmailEnabled")
    @l
    private final Boolean isEmailEnabled;

    @com.google.gson.annotations.c("isPushAllowed")
    @l
    private final Boolean isPushAllowed;

    @com.google.gson.annotations.c("isPushEnabled")
    @l
    private final Boolean isPushEnabled;

    @com.google.gson.annotations.c("isUpdateLastViewTime")
    @l
    private final Boolean isUpdateLastViewTime;

    @com.google.gson.annotations.c("pushFrequency")
    @l
    private final C14231b pushFrequency;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public d(@l C14230a c14230a, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l C14231b c14231b, @l String str) {
        this.emailFrequency = c14230a;
        this.isEmailEnabled = bool;
        this.isPushAllowed = bool2;
        this.isPushEnabled = bool3;
        this.isUpdateLastViewTime = bool4;
        this.pushFrequency = c14231b;
        this.title = str;
    }
}
