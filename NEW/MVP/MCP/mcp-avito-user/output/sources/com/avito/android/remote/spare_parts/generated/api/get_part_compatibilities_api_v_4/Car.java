package com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_4;

import Pl0.j;
import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car;", "", "LPl0/j;", "image", "Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car$Status;", "status", "", "subtitle", "title", "<init>", "(LPl0/j;Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car$Status;Ljava/lang/String;Ljava/lang/String;)V", "LPl0/j;", "a", "()LPl0/j;", "Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car$Status;", "b", "()Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car$Status;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Status", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Car {

    @c("image")
    @l
    private final j image;

    @c("status")
    @l
    private final Status status;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetPartCompatibilitiesApiV4Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Compatible", "Unknown", "NoData", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("compatible")
        public static final Status Compatible;

        @c("noData")
        public static final Status NoData;

        @c("unknown")
        public static final Status Unknown;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f254368b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f254369c;

        static {
            Status status = new Status("Compatible", 0, "compatible");
            Compatible = status;
            Status status2 = new Status("Unknown", 1, "unknown");
            Unknown = status2;
            Status status3 = new Status("NoData", 2, "noData");
            NoData = status3;
            Status[] statusArr = {status, status2, status3};
            f254368b = statusArr;
            f254369c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f254368b.clone();
        }
    }

    public Car(@l j jVar, @l Status status, @k String str, @k String str2) {
        this.image = jVar;
        this.status = status;
        this.subtitle = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final j getImage() {
        return this.image;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
