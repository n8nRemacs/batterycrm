package org.mockito.internal.configuration.plugins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: PluginFileReader.java */
/* loaded from: classes7.dex */
class c {
    public static String a(InputStream inputStream) throws IOException {
        LinkedList<String> linkedList = new LinkedList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                linkedList.add(line);
            } catch (IOException e12) {
                throw new MockitoException("Problems reading from: " + inputStream, e12);
            }
        }
        for (String strSubstring : linkedList) {
            int iIndexOf = strSubstring.indexOf(35);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            String strTrim = strSubstring.trim();
            if (strTrim.length() > 0) {
                return strTrim;
            }
        }
        return null;
    }
}
