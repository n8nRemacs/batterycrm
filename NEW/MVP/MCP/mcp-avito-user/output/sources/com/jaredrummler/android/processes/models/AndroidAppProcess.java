package com.jaredrummler.android.processes.models;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import java.io.File;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class AndroidAppProcess extends AndroidProcess {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f364303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364304e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f364301f = new File("/dev/cpuctl/tasks").exists();

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f364302g = Pattern.compile("^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$");
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new a();

    public static final class NotAndroidAppProcessException extends Exception {
        public NotAndroidAppProcessException(int i12) {
            super(String.format("The process %d does not belong to any application", Integer.valueOf(i12)));
        }
    }

    public static class a implements Parcelable.Creator<AndroidAppProcess> {
        @Override // android.os.Parcelable.Creator
        public final AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AndroidAppProcess[] newArray(int i12) {
            return new AndroidAppProcess[i12];
        }
    }

    public AndroidAppProcess(int i12) throws NumberFormatException, NotAndroidAppProcessException {
        int iC2;
        boolean z12;
        super(i12);
        String str = this.f364305b;
        if (str != null && f364302g.matcher(str).matches()) {
            if (new File("/data/data", this.f364305b.split(":")[0]).exists()) {
                if (f364301f) {
                    Locale locale = Locale.ENGLISH;
                    Cgroup cgroup = new Cgroup(G.e(i12, "/proc/", "/cgroup"));
                    ControlGroup controlGroupB = cgroup.b("cpuacct");
                    ControlGroup controlGroupB2 = cgroup.b("cpu");
                    if (controlGroupB2 != null && controlGroupB != null) {
                        String str2 = controlGroupB.f364310d;
                        if (str2.contains("pid_")) {
                            z12 = !controlGroupB2.f364310d.contains("bg_non_interactive");
                            try {
                                iC2 = Integer.parseInt(str2.split("/")[1].replace("uid_", ""));
                            } catch (Exception unused) {
                                Locale locale2 = Locale.ENGLISH;
                                iC2 = new Status(c.i(this.f364306c, "/status", new StringBuilder("/proc/"))).c();
                            }
                            controlGroupB.toString();
                            controlGroupB2.toString();
                        }
                    }
                    throw new NotAndroidAppProcessException(i12);
                }
                Stat statB = Stat.b(i12);
                Locale locale3 = Locale.ENGLISH;
                Status status = new Status(G.e(i12, "/proc/", "/status"));
                boolean z13 = Integer.parseInt(statB.f364312c[40]) == 0;
                iC2 = status.c();
                z12 = z13;
                this.f364303d = z12;
                this.f364304e = iC2;
                return;
            }
        }
        throw new NotAndroidAppProcessException(i12);
    }

    @Override // com.jaredrummler.android.processes.models.AndroidProcess, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        parcel.writeByte(this.f364303d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f364304e);
    }

    public AndroidAppProcess(Parcel parcel) {
        super(parcel);
        this.f364303d = parcel.readByte() != 0;
        this.f364304e = parcel.readInt();
    }
}
